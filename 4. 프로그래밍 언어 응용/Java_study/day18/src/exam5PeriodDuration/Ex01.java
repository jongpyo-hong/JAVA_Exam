package exam5PeriodDuration;

import java.time.Period;

public class Ex01 {
    public static void main(String[] args) {
        Period p1 = Period.of(2,3,12);
        System.out.println(p1);

        Period p2 = p1.plusDays(150);
        System.out.println(p2);
        long months = p2.toTotalMonths();
        System.out.println(months+"개월");
    }
}
