package exam1_utilsArrays;

import java.util.Arrays;

public class Ex01 { // deepToString(), deepEquals()
    public static void main(String[] args) {
        int [][] nums = {{1, 2, 3}, {4, 5, 6}};
        int [][] nums2 = {{1, 2, 3}, {4, 5, 6}};
        int [] num = {1,2,3};
        System.out.println(Arrays.toString(nums));

        System.out.println(Arrays.deepToString(nums)); // 다차원 배열에서는 deepToString()을 이용한다

        boolean same = Arrays.equals(nums, nums2);
        System.out.println(same);

        boolean same2 =Arrays.deepEquals(nums, nums2); // 다차원 배열에서는 deepEquals()를 이용한다
        System.out.println(same2);

    }
}
