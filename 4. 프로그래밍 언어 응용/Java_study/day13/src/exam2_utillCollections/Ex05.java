package exam2_utillCollections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex05 { // swap()
    public static void main(String[] args) {
        List<String> names = Arrays.asList("이름1", "이름2", "이름3", "이름4");
        Collections.swap(names, 0, 3); // names의 0번과, 3번의 위치를 바꾼다
        System.out.println(names);
    }
}
