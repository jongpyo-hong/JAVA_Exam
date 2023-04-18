package exam4_collect;

public class Student {
    private int ban;
    private int grade;
    private String name;
    private char gender;

    public Student(int ban, int grade, String name, char gender) {
        this.ban = ban;
        this.grade = grade;
        this.name = name;
        this.gender = gender;
    }

    public int getBan() {
        return ban;
    }

    public void setBan(int ban) {
        this.ban = ban;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean isFemale() {
        return gender == 'F';
    }

    @Override
    public String toString() {
        return "Student{" +
                "ban=" + ban +
                ", grade=" + grade +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
