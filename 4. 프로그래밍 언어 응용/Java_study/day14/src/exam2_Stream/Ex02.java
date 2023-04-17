package exam2_Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex02 {
    public static void main(String[] args) {
        Integer[] nums1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Stream<Integer> stm = Arrays.stream(nums1);

        int total1 = stm.mapToInt(n->n).sum();
        System.out.println(total1);

        System.out.println(Arrays.toString(nums1));

        //int total2 = stm.mapToInt(n->n).sum(); // 스트림은 일회용
        //System.out.println(total2);
    }
}
