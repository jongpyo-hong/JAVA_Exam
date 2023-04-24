package exam1_LocalDate;

import java.time.LocalDate;

public class Ex05 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = date1.minusWeeks(1); // 1주전

        System.out.println("date2 < date1 : " + date2.isBefore(date1));
        System.out.println("date1 > date2 : " + date1.isAfter(date2));
    }
}
