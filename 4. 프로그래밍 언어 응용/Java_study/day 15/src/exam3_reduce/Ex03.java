package exam3_reduce;

import java.util.stream.IntStream;

public class Ex03 {
    public static void main(String[] args) {
        int total = IntStream.rangeClosed(1, 10).reduce(0, (acc, n) -> {

            System.out.println("acc = " + acc + ", n = " + n);

            return acc + n;
        });
        System.out.println(total);
    }
}
