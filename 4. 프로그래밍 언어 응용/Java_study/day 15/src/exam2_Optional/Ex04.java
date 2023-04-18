package exam2_Optional;

import java.util.stream.IntStream;

public class Ex04 {
    public static void main(String[] args) {
        int total = IntStream.rangeClosed(1, 10).reduce(0, (acc, n) -> {
            System.out.println("acc = " + acc + ", n = "+ n);
            int result = acc + n;
            return result;
        });
        System.out.println(total);
    }
}
