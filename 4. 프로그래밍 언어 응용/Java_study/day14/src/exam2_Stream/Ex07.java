package exam2_Stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex07 {
    public static void main(String[] args) {// Stream.generate() - 스트림 반복
        int[] nums = IntStream.generate(() -> 1).limit(10).toArray();
        System.out.println(Arrays.toString(nums));
    }
}
