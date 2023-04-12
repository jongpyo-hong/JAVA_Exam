package exam04;

import java.util.Vector;

public class Ex02 {
    public static void main(String[] args) {
        Vector<String> names = new Vector<>(4);
        System.out.println("capacity : " + names.capacity());
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");
        names.add("이름4");
        System.out.println("capacity : " + names.capacity());

        names.add("이름5"); // 수용가능한 capacity를 넘으면 두배로 늘린다
        System.out.println("capacity : " + names.capacity());



    }
}
