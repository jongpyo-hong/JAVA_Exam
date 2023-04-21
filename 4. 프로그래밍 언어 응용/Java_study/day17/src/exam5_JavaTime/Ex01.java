package exam5_JavaTime;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class Ex01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalDate date1 = LocalDate.of(2022,4,30);
        System.out.println(date1);

        String[] yoilstr = {"", "월", "화", "수", "목", "금", "토", "일"};

        /**
        int year = date1.get(ChronoField.YEAR);
        int month = date1.get(ChronoField.MONTH_OF_YEAR);
        int day = date1.get(ChronoField.DAY_OF_MONTH); // 1~12
        int yoil = date1.get(ChronoField.DAY_OF_WEEK); // 1(월요일) ~ 7(일요일)
         */

        int year = date1.getYear();
        int month = date1.getDayOfMonth();
        int day = date1.getDayOfMonth();
        int yoil = date1.getDayOfWeek().getValue();
        String yoilStr = date1.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREA);

        System.out.printf("year=%d, month=%d, day=%d, yoil=%s, yoilStr=%s%n", year, month, day, yoilstr[yoil], yoilStr);
    }
}