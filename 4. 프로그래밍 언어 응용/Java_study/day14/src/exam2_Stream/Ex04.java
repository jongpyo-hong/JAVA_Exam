package exam2_Stream;

import java.util.Arrays;

public class Ex04 {
    public static void main(String[] args) {
        String[] strs = {"A", "B", "C", "D"};
        Arrays.stream(strs).forEach(s-> System.out.println(s));
    }
}
