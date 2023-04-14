package exam1_utilsArrays;

import java.util.Arrays;
import java.util.Comparator;

public class Ex02 {
    public static void main(String[] args) { // sort()

        Comparator<String> comp = new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1); // 내림차순
            }
        };

        String[] names = {"이름3", "이름2", "이름1", "이름4", "이름5"};
        Arrays.sort(names, Comparator.reverseOrder());

        System.out.println(Arrays.toString(names)); // Arrays.sort() - 정렬
    }
}
