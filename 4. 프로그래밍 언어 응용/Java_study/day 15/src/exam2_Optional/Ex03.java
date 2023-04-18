package exam2_Optional;

import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        String[] fruits = { "AAA", "Apple", "Orange", "Mango", "Melon", "Banana" };
        String str = Arrays.stream(fruits).filter(s -> s.length() > 5).findFirst().orElse(null);
        System.out.println(str);
    }
}
