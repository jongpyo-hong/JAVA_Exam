package exam5PeriodDuration;

import java.time.LocalDate;
import java.time.Period;

public class Ex02 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(1995,1,1);
        LocalDate date2 = LocalDate.now();

        Period p1 = Period.between(date1, date2);
        long months = p1.toTotalMonths();
        System.out.println(months);
    }
}
