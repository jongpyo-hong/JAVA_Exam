package exam01;

import java.util.Arrays;
import java.util.Objects;

public class Ex01 {
    public static void main(String[] args) {
        method("AA", "BB", "CC");
        method("AA","BB");
        int hash = Objects.hash("A", 1, "C");
        int hash2 = Objects.hash("A", 1, "C");

        System.out.println("hash = " + hash);
        System.out.println("hash2 = " + hash2);
    }

    public static void method(String... strs) {
        System.out.println( Arrays.toString(strs));
    }
}
