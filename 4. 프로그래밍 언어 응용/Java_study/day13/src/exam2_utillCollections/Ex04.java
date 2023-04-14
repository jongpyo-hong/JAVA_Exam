package exam2_utillCollections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex04 { // shuffle()
    public static void main(String[] args) {
        List<String> names = Arrays.asList("이름1", "이름2", "이름3", "이름4");
        Collections.shuffle(names); // shuffle() : 무작위로 배열안의 값을 섞는다
        System.out.println(names);
        Collections.sort(names, Comparator.reverseOrder());
        System.out.println(names);
    }
}
