package exam05;

import java.lang.annotation.Annotation;

public class Ex01 {
    public static void main(String[] args) {
        Class cls = Student.class;
        MyAnno anno = (MyAnno)cls.getAnnotation(MyAnno.class);
        String value = anno.value();
        int min = anno.min();
        int max = anno.max();
        int[] nums = anno.nums();
        System.out.println(nums);

    }
}
