package exam2_utillCollections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex03 { // rotate()
    public static void main(String[] args) {
        List<String> names = Arrays.asList("이름1", "이름2", "이름3", "이름4");
        Collections.rotate(names,2);
        System.out.println(names);

        Collections.rotate(names,3);
        System.out.println(names);
    }
}
