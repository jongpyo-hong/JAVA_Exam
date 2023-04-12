package day02;

public class Quiz1 {
    public static void main(String[] args) {
        // 1. 변수 두 개를 선언해서 20과 3.0을 대입하고 두 변수의 사칙연산 결과를 정수로 출력해 보시오
        int a = 20;
        double b = 3.0;
        double result1 = a + b;
        double result2 = a - b;
        double result3 = a * b;
        double result4 = a / b;
        System.out.println((int) result1);
        System.out.println((int) result2);
        System.out.println((int) result3);
        System.out.println((int) result4);
    }
}
