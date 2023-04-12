package exam01;

import java.util.HashSet;

public class Ex04 {
    public static void main(String[] args) {
        HashSet<String> data = new HashSet<>();
        data.add(new String("abc"));
        data.add(new String("abc"));
        data.add(new String("def"));

        for (String s : data) {
            System.out.println(s);
        }
    }
}
