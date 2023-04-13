package exam02;

import java.util.Objects;

public class Student {
    private int id;
    private String name;

    public Student (int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hashCode='" + hashCode() + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Student) {
            Student student = (Student) obj;
            if (id == student.id && name.equals(student.name)) {
                return true;
            }
        }

        return false;
    }
}
