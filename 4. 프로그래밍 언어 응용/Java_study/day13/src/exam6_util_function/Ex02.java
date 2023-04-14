package exam6_util_function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ex02 { // forEach()
    public static void main(String[] args) {
        List<String> names = Arrays.asList("이름 1", "이름 2", "이름 3");
        names.forEach(s -> System.out.println(s));
    }
}
