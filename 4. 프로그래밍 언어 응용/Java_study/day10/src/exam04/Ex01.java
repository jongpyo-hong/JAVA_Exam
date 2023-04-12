package exam04;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        Class cls = Person.class;
        MyAnno anno = (MyAnno)cls.getAnnotation(MyAnno.class);

        String[] values = anno.value();
        int min = anno.min();
        int max = anno.max();

        System.out.println(Arrays.toString(values));
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
