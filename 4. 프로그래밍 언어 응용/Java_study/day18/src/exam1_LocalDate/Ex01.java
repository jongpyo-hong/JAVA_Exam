package exam1_LocalDate;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Ex01 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now(); // .now() 현재 날짜
        System.out.println(date1);

        /**LocalDate date2 = LocalDate.of(2022,4,21); // .of() 지정 날짜
        System.out.println(date2);*/

        /**int year = date1.get(YEAR);
        int month = date1.get(MONTH_OF_YEAR); // 1 ~ 12
        int day = date1.get(DAY_OF_MONTH);*/

        DayOfWeek dayOfWeek = date1.getDayOfWeek();
        int yoil = dayOfWeek.getValue();
        //String yoilstr = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.KOREA);
        //String yoilstr = dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.KOREA);
        String yoilstr = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.ENGLISH);

        //int yoil = date1.get (DAY_OF_WEEK); // 무슨요일 1 ~ 7

        int year = date1.getYear();
        int month = date1.getMonthValue();
        int day = date1.getDayOfMonth();


        System.out.printf("year=%d, month=%d, day=%d, yoil=%d%n", year, month, day, yoil);
        System.out.printf("요일=%s%n", yoilstr);
    }
}
