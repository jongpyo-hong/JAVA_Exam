package day02;

public class Ex11 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <= 100; i++) {
            total += i;
            if(i == 50) {
                break; // 반복 중단
            }
        }

        System.out.println("합계 :" + total);

    }
}
