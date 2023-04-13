package exam03;

import java.util.Comparator;
import java.util.TreeSet;

public class Ex02 {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();


        students.add(new Student(1001, "이름2"));
        students.add(new Student(1009, "이름1"));
        students.add(new Student(1000, "이름1"));
        students.add(new Student(1003, "이름4"));
        students.add(new Student(1002, "이름3"));

        for (Student s : students) {
            System.out.println(s);
        }

    }
}
