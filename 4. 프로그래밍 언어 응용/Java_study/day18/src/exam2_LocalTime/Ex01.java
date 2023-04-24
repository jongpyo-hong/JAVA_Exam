package exam2_LocalTime;

import java.time.LocalTime;

public class Ex01 {
    public static void main(String[] args) {
        LocalTime time1 = LocalTime.now();
        System.out.println(time1);
        LocalTime time2 = LocalTime.of(10,10,10);
        System.out.println(time2);
    }
}
