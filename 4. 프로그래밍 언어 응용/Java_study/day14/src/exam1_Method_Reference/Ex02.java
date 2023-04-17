package exam1_Method_Reference;

import java.util.function.IntBinaryOperator;

public class Ex02 {
    public static void main(String[] args) { // 매개변수의 메서드 참조
        Calculator cal = new Calculator();

        //IntBinaryOperator func1 = (a, b) -> cal.add(a,b); // Calculator::add
        IntBinaryOperator func1 = cal::add;
        int result = func1.applyAsInt(10,20);
        System.out.println(result);
    }
}
