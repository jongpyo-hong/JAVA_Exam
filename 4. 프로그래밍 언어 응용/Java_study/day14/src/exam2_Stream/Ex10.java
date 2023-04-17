package exam2_Stream;

import java.util.Arrays;
import java.util.List;

public class Ex10 { // stream.distinct() - 중복제거
    public static void main(String[] args) {
        List<String> names = Arrays.asList("이름1", "이름2", "이름1", "이름3", "이름4");

        List<String> names2 = names.stream().distinct().toList();
        System.out.println(names2);

    }
}
