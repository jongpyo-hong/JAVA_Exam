package exam1_LocalDate;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class Ex04 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        System.out.println(date1);

        LocalDate date2 = date1.with(ChronoField.MONTH_OF_YEAR, 12);
        System.out.println(date2);

        LocalDate date3 = date1.withMonth(12);
        System.out.println(date3);
    }
}
