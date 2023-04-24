package exam3_Zone;

import java.time.ZonedDateTime;

public class Ex01 {
    public static void main(String[] args) {
        ZonedDateTime zdt1 = ZonedDateTime.now();
        System.out.println(zdt1); // ZoneId [Asia/Seoul]
    }
}
