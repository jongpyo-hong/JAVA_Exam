package exam01;

import java.awt.*;

public class Ex02 {
    public static void main(String[] args) {

    try {
        int num1 = 10;
        int num2 = 0;

        int result = num1 / num2; // 예외 이후의 코드는 실행되지 않는다
        System.out.println(result);

    } catch (ArithmeticException e) {
        String message = e.getMessage();
        System.out.println(message);
        // System.out.println("예외처리");
        e.printStackTrace();
    }

        System.out.println("매우 중요한 실행 코드");
    }
}
