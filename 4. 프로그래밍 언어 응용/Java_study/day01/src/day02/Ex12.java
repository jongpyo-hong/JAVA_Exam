package day02;

public class Ex12 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <= 100; i++) {
            /**if (i % 2 == 0) { // 2로 나눈 나머지가 0이면 짝수
            total += i;
            } */
            if (i % 2 == 1) { // 홀수를 건너뛰면 짝수
                continue;
            }
            total += i;
        }
        System.out.println("합계 : " + total);
    }
}
