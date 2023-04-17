package exam2_Stream;

import java.util.Random;

public class Ex06 {
    public static void main(String[] args) { // 스트림의 무한반복배열
        Random rand = new Random();
        //rand.ints().limit(10).forEach(n -> System.out.println(n));
        rand.ints().limit(10).forEach(System.out::println); // 메서드 참조
    }
}
