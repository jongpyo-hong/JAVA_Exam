package exam4_ZoneOffset;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class Ex02 {
    public static void main(String[] args) {
        LocalDateTime date1 = LocalDateTime.now();
        ZoneOffset seoul = ZoneOffset.of("+9");
        OffsetDateTime odt = date1.atOffset(seoul); // Id가 아닌 "+시간"
        System.out.println(odt);
    }
}
