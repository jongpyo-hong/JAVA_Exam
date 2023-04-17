package exam2_Stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex09 {
    public static void main(String[] args) {
        //int[] nums = IntStream.range(0, 10).toArray(); // range(a,b) a이상 b미만
        //int[] nums = IntStream.rangeClosed(0, 10).toArray(); // rangeClose(a,b) a이상 b이하
        //System.out.println(Arrays.toString(nums));

        IntStream stm1 = IntStream.rangeClosed(0,50); // 0부터 50까지의 IntStream
        IntStream stm2 = IntStream.rangeClosed(51, 100); // 51부터 100까지의 IntStream

        IntStream stm3 = IntStream.concat(stm1, stm2);

        int total = stm3.filter(n -> (n % 2) == 1).sum(); // filter() - 분류
        System.out.println(total);

        int total2 = IntStream.rangeClosed(0,100).filter(n -> (n % 2)==1).sum(); // 0부터 100까지의 IntStream
        System.out.println(total2);

    }
}
