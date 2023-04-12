package day02;

public class Quiz4 {
    public static void main(String[] args) {

        // 4. 구구단을 홀수 단만 출력하도록 프로그램을 만드시오. 구현 소스
        for (int i = 3; i <= 9; i++) {
            if (i % 2 == 1){;
                System.out.println("======" + i + "단 ======");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "X" + j + "=" + (i*j));
            }
            }
        }

        //  continue를 이용한 방법

        for (int i = 2; i <= 9; i++) {
            if (i % 2 ==0) { // 짝수단을 건너띄면 홀수만 남는다.
                continue;
            }
            System.out.println("======" + i + "단 ======");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "X" + j + "=" + (i*j));
            }
        }
    }
}
