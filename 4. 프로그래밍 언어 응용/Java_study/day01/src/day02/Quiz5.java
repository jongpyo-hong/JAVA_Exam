package day02;

public class Quiz5 {
    public static void main(String[] args) {

        // 구구단을 단보다 곱하는 수가 크거나 같은 경우만 출력하는 프로그램을 만들어 보세요.구현 소스

        for (int i = 2; i <= 9; i++) {
            System.out.println("======" + i + "단 ======");
            for (int j = 1; j <= 9; j++) {
                if (j < i){
                    continue;
                }
                System.out.println(i + "X" + j + "=" + (i*j));
            }
        }
    }
}
