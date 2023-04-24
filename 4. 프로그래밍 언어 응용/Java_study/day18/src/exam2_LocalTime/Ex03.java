package exam2_LocalTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex03 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2023, 3, 10);
        LocalTime time1 = LocalTime.of(23,20,15);

        LocalDateTime dateTime1 = LocalDateTime.of(date1,time1); // LocalDate + LocalTime
        System.out.println(dateTime1);

        LocalDateTime dateTime2 = date1.atTime(time1); // LocalDate.atTime(LocalTime) : LocalDate객체에 LocalTime을 결합
        System.out.println(dateTime2);

        LocalDateTime dateTime3 = time1.atDate(date1); // LocalTime.atDate(LocalDate) : Time에 Date를 결합아여 LocalDateTime 반환
        System.out.println(dateTime3);
    }
}
