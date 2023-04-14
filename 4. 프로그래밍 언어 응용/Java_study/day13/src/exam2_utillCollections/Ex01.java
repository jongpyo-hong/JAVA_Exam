package exam2_utillCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex01 { // addAll()
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        Collections.addAll(nums, 1, 2, 3, 4, 5, 6); // addAll() = 배열에 복수의 값을 추가
        System.out.println(nums);

        /**List<Integer> checkedNums = Collections.checkedList(nums, Integer.class);
        System.out.println(checkedNums);*/

        List<String> chars = Arrays.asList("1","2","3","4");
        Collections.fill(chars, "*"); // fill(..., b) = 지정한 배열의 값을 b의 값으로 채운다
        System.out.println(chars);
    }
}
