package exam04;

import java.util.ArrayList;

public class Ex01 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("이름2");
        names.add("이름1");
        names.add("이름3");
        names.add("이름4");
        names.add("이름5");

        //System.out.println(names); // names.toString();
        /**
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            System.out.println(name);
        } */

        for (String name : names) {
            System.out.println(name);
        }

    }
}
