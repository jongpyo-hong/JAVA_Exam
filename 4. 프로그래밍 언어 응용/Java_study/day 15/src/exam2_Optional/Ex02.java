package exam2_Optional;

import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) {
        String[] fruits = { "AAA", "Apple", "Orange", "Mango", "Melon", "Banana" };
        boolean allMatch = Arrays.stream(fruits).allMatch(s -> s.length() >= 5); // allMatch() : 모든 요소의 조건이 참일 때 참
        System.out.println(allMatch);

        boolean anyMatch = Arrays.stream(fruits).anyMatch(s -> s.length() >= 6); // anyMatch() : 어떤 요소중 조건이 하나라도 참일 때 참
        System.out.println(anyMatch);

    }
}
