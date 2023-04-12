package exam01;

public class Ex02 {
    public static void main(String[] args) {
        int[][] nums = { {10, 20, 30}, {40, 50, 60} }; // 이차원 배열
        for (int i = 0; i < nums.length; i++) { // 행
            for (int j = 0; j < nums[i].length; j++) { // 열
                System.out.println(i + "행, " + j + "열 : " + nums[i][j]);
            }
        }
    }
}
