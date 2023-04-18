package exam1_Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex02_peek {
    public static void main(String[] args) {
        String[] fruits = { "Apple", "Orange", "Mango", "Melon", "Banana" };

        Stream<String> fruits2 = Arrays.stream(Arrays.stream(fruits).peek(System.out::println)
                .map(String::toUpperCase)
                .toArray(String[]::new));



    }
}
