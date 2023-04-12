package exam01;

import java.util.HashSet;

public class Ex03 {
    public static void main(String[] args) { // HashCode()의 재정의로 동등성 비교를 할수있다
        HashSet<Student> data =  new HashSet<>();
        data.add(new Student(1000, "이름1"));
        data.add(new Student(1001, "이름2"));
        data.add(new Student(1000, "이름1"));

        for (Student s : data) {
            System.out.println(s);
        }
    }
}
