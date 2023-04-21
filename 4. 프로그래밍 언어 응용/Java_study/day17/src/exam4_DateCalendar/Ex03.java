package exam4_DateCalendar;

import java.util.Calendar;
import static java.util.Calendar.*;
public class Ex03 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        printDate(cal);

        cal.add(DAY_OF_MONTH, 7); // .add() - 날짜 가감 메서드
        printDate(cal); // printDate : 날짜 출력

        cal.add(DAY_OF_MONTH, -7);
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
