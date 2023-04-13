package exam05;

import java.util.Arrays;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("이름1", "이름2", "이름3", "이름4"); // 생성자 없이 객체 생성하는 Arrays.asList(T... )
        System.out.println(names);

        int[] nums = new int[10];
        Arrays.fill(nums, 1); // .fill(T, V) 배열을 V로 꽉채운다

        System.out.println(Arrays.toString(nums));

        int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] nums2 = {1, 2, 3, 4, 5, 6, 7, 8};
        int m = Arrays.mismatch(nums1,nums2); // .mismatch(a, b) a, b배열을 비교한 후 다른 인덱스를 반환
        System.out.println("mismatch : " + m);
    }
}
