package exam5PeriodDuration;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex03 {
    public static void main(String[] args) {
        LocalTime time1 = LocalTime.now();
        LocalTime time2 = LocalTime.of(23,59,59);

        Duration du = Duration.between(time1, time2);
        System.out.println(du);
        long sec = du.getSeconds();
        //System.out.println(sec);

        LocalDateTime date1 = LocalDate.now().atStartOfDay();
        LocalDateTime date2 = date1.plusSeconds(sec);
        System.out.println(date2);

        int hour = date2.getHour();
        int minute = date2.getMinute();
        int second = date2.getSecond();

        System.out.printf("%d시간 %d분 %s초 남았습니다.%n", hour,minute,second);
    }
}
