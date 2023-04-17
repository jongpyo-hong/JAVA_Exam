package exam2_Stream;

import java.util.Arrays;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        Integer[] nums1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> nums2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        int total1 = Arrays.stream(nums1).mapToInt(n->n).sum();

        int total2 = nums2.stream().mapToInt(n->n).sum();

        System.out.println("total1 = " + total1);
        System.out.println("total2 = " + total2);
    }
}
