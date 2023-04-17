package exam1_Method_Reference;

import java.util.function.IntBinaryOperator;

public class Calculator {

    private IntBinaryOperator cal = this::add;
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}
