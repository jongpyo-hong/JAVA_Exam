package exam1_LocalDate;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex03 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance(); // 객체 생성
        SimpleDateFormat sdf = new SimpleDateFormat();
        toFormat(cal);

        cal.add(Calendar.DAY_OF_MONTH, -7);
        toFormat(cal);
    }

    private static void toFormat(Calendar cal) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(new Date(cal.getTimeInMillis())));
    }
}
