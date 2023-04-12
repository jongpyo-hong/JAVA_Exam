package exam01;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        int[][] nums = new int[2][3]; // 이차원 배열 [행],[열], 공간의 주소가 행,열만큼 존재
        // 0행
        nums[0][0] = 10;
        nums[0][1] = 20;
        nums[0][2] = 30;
        // 1행
        nums[1][0] = 40;
        nums[1][1] = 50;
        nums[1][2] = 60;

        System.out.println(Arrays.deepToString(nums));
    }
}
