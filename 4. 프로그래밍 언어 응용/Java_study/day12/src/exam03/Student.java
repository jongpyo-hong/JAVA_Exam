package exam03;

import java.util.Collection;
import java.util.Objects;

public class Student implements Comparable<Student> {
    private int id;
    private String name;

    public Student(int id, String name) {
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

    @Override
    public int compareTo(Student o) {
        //return o.id - this.id; // 내림차순
        //return this.id - o.id; // 오름차순
        //return Integer.valueOf(id).compareTo(o.id); // 오름차순
        //return Integer.valueOf(id).compareTo(o.id) * -1; // 내림차순

        //return name.compareTo(o.name); // name을 기준으로 오름차순
        //return name.compareTo(o.name) * -1; // name을 기준으로 내림차순
        return String.valueOf(name).compareTo(o.name)* -1;// name을 기준으로 내림차순
    }
}
