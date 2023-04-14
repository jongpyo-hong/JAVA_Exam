package exam6_util_function;

import java.awt.*;
import java.util.function.Function;

public class Ex04 { // Function.identity()
    public static void main(String[] args) {

        //Function<String, String> func1 = s -> s; // 매개변수와 같은 값의 자료형을 반환한다
        Function<String, String> func1 = Function.identity(); // 매개변수와 같은 값의 자료형을 반환한다
        String str = func1.apply("값");
        System.out.println(str);
    }
}
