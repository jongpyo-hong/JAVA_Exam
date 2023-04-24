package exam6EPOCH;

import java.time.Instant;

public class Ex01 {
    public static void main(String[] args) {
        Instant date1 = Instant.now();
        System.out.println(date1);

        long timestamp = date1.toEpochMilli();
        System.out.println(timestamp);
    }
}
