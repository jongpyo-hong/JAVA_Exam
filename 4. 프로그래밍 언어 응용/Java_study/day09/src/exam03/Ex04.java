package exam03;

import java.util.Objects;

public class Ex04 {
    public static void main(String[] args) {
        String[][] strs1 = {{"a", "b", "c"}, {"d", "e", "f"}};
        String[][] strs2 = {{"a", "b", "c"}, {"d", "e", "f"}};
        System.out.println("equals : " + Objects.equals(strs1, strs2));
        System.out.println("deepEquals : " + Objects.deepEquals(strs1, strs2)); // 2차원 배열 비교
    }
}
