package exam1_LocalDate;

import java.time.LocalDate;

public class Ex02 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        System.out.println(date1);

        //LocalDate date2 = date1.minus(7, ChronoUnit.DAYS); // date1값은 불변, 새로운 객체를 생성해야한다
        LocalDate date2 = date1.minusDays(7);
        System.out.println(date2);

        //LocalDate date3 = date2.plus(7,ChronoUnit.DAYS);
        LocalDate date3 = date2.plusDays(7); // 필드를 추가하지 않아도 되는 메서드가 정의되어 있다
        System.out.println(date3);
    }
}
