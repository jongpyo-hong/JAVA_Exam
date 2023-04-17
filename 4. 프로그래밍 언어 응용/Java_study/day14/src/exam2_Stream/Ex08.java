package exam2_Stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex08 {
    public static void main(String[] args) {// Stream.iterate - 증가식
        int[] nums = IntStream.iterate(0, n -> n+2).limit(10).toArray();

        System.out.println(Arrays.toString(nums));
    }
}
