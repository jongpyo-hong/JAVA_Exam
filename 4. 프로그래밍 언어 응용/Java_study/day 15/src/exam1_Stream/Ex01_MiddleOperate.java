package exam1_Stream;

import java.util.Arrays;

public class Ex01_MiddleOperate { // .skip(), .sorted(), .filter(), .map()
    public static void main(String[] args) {
        String[] fruits = { "Apple", "Orange", "Mango", "Melon", "Banana" };

        Arrays.stream(fruits).skip(3).forEach(System.out::println); // 메서드 참조

        String[] fruits2 = Arrays.stream(fruits).filter(s -> s.length() > 5).toArray(String[]::new);
        System.out.println(Arrays.toString(fruits2));

        String[] fruits3 = Arrays.stream(fruits).map(String::toUpperCase)
                                                .sorted()
                                                .filter(s-> s.length() > 5)
                                                .toArray(String[]::new);

        System.out.println(Arrays.toString(fruits3));

    }
}
