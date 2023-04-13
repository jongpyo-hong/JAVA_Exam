package exam02;

import java.util.HashSet;
import java.util.Iterator;

public class Ex02 {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
    /**
        String n1 = new String("이름1"); // 객체
        String n2 = "이름1"; // 문자열 상수

        System.out.println(n1.equals(n2));
        System.out.println("n1.hashCode() : " + n1.hashCode());
        System.out.println("n2.hashCode() : " + n2.hashCode());
     */
        students.add(new Student(1000, "이름1"));
        students.add(new Student(1000, "이름1"));
        students.add(new Student(1001, "이름2"));
        students.add(new Student(1002, "이름3"));
        students.add(new Student(1003, "이름4"));

        Iterator<Student> iter = students.iterator();
        while(iter.hasNext()) {
            Student s = iter.next();
            System.out.println(s);
        }

        iter = students.iterator();
        while(iter.hasNext()) {
            Student s = iter.next();
            System.out.println(s);
        }

        /**
        for (Student student : students) {
            System.out.println(student);
        }*/
        // hashCode, equals를 동등성 비교로 재정의하면 중복되는 값의 주소가 같아져 중복이 없어진다.
    }
}
