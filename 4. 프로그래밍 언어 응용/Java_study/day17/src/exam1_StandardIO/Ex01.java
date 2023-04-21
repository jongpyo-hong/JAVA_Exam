package exam1_StandardIO;

public class Ex01 { // print, println(), printf
    public static void main(String[] args) {
        System.out.print("A");
        System.out.print("B");
        System.out.println(); // \n

        System.out.println("C");
        System.out.println("D");

        int num1 = 10;
        int num2 = 20;

        System.out.printf("%d + %d = %d%n",num1, num2, num1+num2); // %d : 정수, %n : 줄개행
        System.out.println("문자");

        System.out.printf("%s(%s)님 점수는 %.2f%n", "이이름", "user", 98.2); // %s : 문자열, %f : 실수, (%.2f) : 소수2자리까지
    }
}
