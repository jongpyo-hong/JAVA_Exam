package exam6_util_function;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class Ex01 { // BiFunction
    public static void main(String[] args) {
        //BiFunction<Integer, Integer, Integer> cal = (a, b) -> a + b; // <매개변수>, <매개변수>, <반환값>
        //BinaryOperator<Integer> cal = (a, b) -> a + b;
        IntBinaryOperator cal = (a, b) -> a + b;
        int result = cal.applyAsInt(10,20);
        System.out.println(result);
    }
}
