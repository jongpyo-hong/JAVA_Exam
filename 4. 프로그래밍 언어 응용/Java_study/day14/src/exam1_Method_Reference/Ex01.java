package exam1_Method_Reference;

import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class Ex01 {
    public static void main(String[] args) { // 생성자의 메서드 참조
        //Consumer<String> func1 = s -> System.out.println(s);
        Consumer<String> func1 = System.out::println;
        func1.accept("값");

        //BiPredicate<String, String> func2 = (s1, s2) -> s1.equals(s2);
        BiPredicate<String, String> func2 = String::equals;
        System.out.println(func2.test("abc","abc"));

    }
}
