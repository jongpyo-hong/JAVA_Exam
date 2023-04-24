package exam01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex01 { // 기존의 날짜,시간 포맷을 사용자 설정으로 바꾸기
    public static void main(String[] args) { // 기존 format 을 DateTimeFormatter 메서드로 사용자 정의하기
        LocalDateTime date1 = LocalDateTime.now();
        System.out.println(date1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm (E)");
        String dateStr = formatter.format(date1);
        System.out.println(dateStr);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yy/MM/dd a hh:mm:ss");
        String dateStr2 = formatter2.format(date1);
        System.out.println(dateStr2);
    }
}
