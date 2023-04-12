package exam02;

public class Ex02 {
    public static void main(String[] args) {
        Integer num1 = new Integer(10);
        Integer num2 = new Integer(20);
        int num3 = num1 + num2; // num1.intValue() + num2.intValue(); // 언박싱
        // 컴파일러가 자동으로 Integer num1, num2 객체에 intValue() 메서드를 추가한다
        // 그래서 객체인 num1 + num2 연산이 가능하다 (원래 객체끼리의 연산은 불가능)
        System.out.println(num3);

        Integer num4 = num3; // Integer,valueOf(num3); // 오토 박싱
        System.out.println(num4);

        int num5 = num4 + 20; // int num5 = num4.intValue() + 20; // 언박싱
        System.out.println(num5);

    }
}
