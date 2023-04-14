package exam6_util_function;

import java.util.function.Function;

public class Ex03 { // 메서드의 결합 andThen(), compose()
    public static void main(String[] args) {
        // 1. 숫자를 입력하면 제곱하는 기능
        // 2. 숫자를 입력하면 2진수로 반환하는 기능

        Function<Integer, Integer> func1 = a -> a*a;
        Function<Integer, String> func2 = a -> Integer.toBinaryString(a);

        int num = func1.apply(10);
        System.out.println(num);

        String b = func2.apply(10);
        System.out.println(b);

        Function<Integer, String> func3 = func1.andThen(func2);

        String b2 = func3.apply(10); // 10을 제곱 + 이진수로 변환
        System.out.println(b2);

        Function<Integer, String> func4 = func2.compose(func1);
        String b3 = func4.apply(10);
        System.out.println(b3);

    }
}
