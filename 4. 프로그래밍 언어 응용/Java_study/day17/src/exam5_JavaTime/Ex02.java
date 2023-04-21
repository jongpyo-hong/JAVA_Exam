package exam5_JavaTime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Ex02 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate after7 = today.plus(7, ChronoUnit.DAYS);


        System.out.println(today); // 기존의 값을 변경하지 않는다
        System.out.println(after7); // 새로운 값을 반환한다
    }
}
