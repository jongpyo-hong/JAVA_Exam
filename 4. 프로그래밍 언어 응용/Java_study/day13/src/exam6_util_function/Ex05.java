package exam6_util_function;

import java.util.function.IntPredicate;

public class Ex05 { // func1.and()
    public static void main(String[] args) {
        // 숫자가 10이상, 100이하인지 체크
        int num = 20;

        IntPredicate func1 = n -> n >= 10;
        IntPredicate func2 = n -> n <= 100;

        IntPredicate func3 = func1.and(func2); // n >= 10 && n <= 100 (func1 조건, func2 조건의 결합)

        boolean result = func3.test(num);
        boolean result2 = func3.test(101);
        System.out.println(result);
        System.out.println(result2);

        IntPredicate func4 = func1.negate(); // n > 10 negate() : not
        boolean result3 = func4.test(num);
        System.out.println(result3);
    }
}
