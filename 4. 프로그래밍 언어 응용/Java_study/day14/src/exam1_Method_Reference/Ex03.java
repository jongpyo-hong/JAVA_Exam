package exam1_Method_Reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.IntFunction;
import java.util.function.Supplier;

public class Ex03 {
    public static void main(String[] args) { // 메서드 참조
        // IntFunction -> 정수를 매개변수를 받고 갯수만큼 int 배열을 만든다

        //IntFunction<int[]> func1 = n -> new int[n];
        IntFunction<int[]> func1 = int[]::new;
        int[] nums = func1.apply(10);
        System.out.println(Arrays.toString(nums));

        Supplier<ArrayList<String>> func2 = () -> new ArrayList<String>();
        Supplier<ArrayList<String>> func3 = ArrayList::new;
        ArrayList<String> list = func3.get();
        System.out.println(list);
    }


}
