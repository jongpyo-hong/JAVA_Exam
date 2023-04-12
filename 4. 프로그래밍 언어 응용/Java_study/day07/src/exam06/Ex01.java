package exam06;

import java.lang.*; // 컴파일러가 자동추가
import java.util.Date;

public class Ex01 {
    public static void main(String[] args) {
        String str = "abc";
        A a = new A();
        System.out.println(a);

        Date date = new Date();
        System.out.println(date); // date.toString();
    }
}
