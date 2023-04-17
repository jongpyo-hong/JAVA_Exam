package exam2_Stream;
import java.util.Arrays;
public class Ex15 {
    public static void main(String[] args) {
        String[] strs = {"aa", "bb", "cc", "dd"};

        /**
        String[] strs2 = Arrays.stream(strs)
                // map(s->s.toUpperCase())
                .map(String::toUpperCase)
                //.toArray(n -> new String[n]);
                .toArray(String[]::new);
         */

        String[] strs2 = Arrays.stream(strs).map(String::toUpperCase).toArray(String[]::new);

        System.out.println(Arrays.toString(strs2));
    }
}
