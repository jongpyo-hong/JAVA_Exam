package exam4_DateCalendar;

import java.util.Calendar;

import static java.util.Calendar.*;
import static java.util.Calendar.SECOND;

public class Ex04 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        printDate(cal);

        //cal.set(MONTH, 11); // 11 -> 12
        //printDate(cal);

        //cal.add(DAY_OF_MONTH, 100); // 말일이 넘어가면 달도 바뀐다
        //printDate(cal);

        cal.roll(DAY_OF_MONTH, 100); // 말일이 넘어가도 일만 초기화
        printDate(cal);

    }

    public static void printDate(Calendar cal) {
        int year = cal.get(YEAR);
        int month = cal.get(MONTH) + 1;
        int day = cal.get(DAY_OF_MONTH);

        int hour = cal.get(HOUR_OF_DAY); // 24
        int minute = cal.get(MINUTE);
        int second = cal.get(SECOND);

        System.out.printf("%d-%d-%d %d:%d:%d%n", year, month, day, hour, minute, second);
    }
}
