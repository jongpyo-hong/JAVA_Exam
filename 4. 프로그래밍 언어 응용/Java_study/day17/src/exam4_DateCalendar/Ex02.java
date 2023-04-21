package exam4_DateCalendar;

import java.util.Calendar;

public class Ex02 {
    public static void main(String[] args) {
        //Calendar cal = new Calendar();
        Calendar cal = Calendar.getInstance(); // 생성자 대신 getInstance() 메서드 사용
        System.out.println(cal);

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH)+1; // 0 ~ 11
        int day = cal.get(Calendar.DAY_OF_MONTH);

        System.out.printf("year=%d, month=%d, day=%d%n", year, month, day);


    }
}
