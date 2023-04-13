package exam03;

import java.util.Comparator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ex01 {
    public static void main(String[] args) {

        Comparator<Integer> comp = new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1); // 내림차순
            }

        };
        Random rand = new Random();
        //Set<Integer> nums = new TreeSet<>(comp); // TreeSet()은 Comparable 기준으로 정렬한다

        // comparable로 기준이 정해지지 않았을 때 대안으로 사용하는 Comparator
        Set<Integer> nums = new TreeSet<>(Comparator.reverseOrder()); // 내림차순 정렬
        nums.add(rand.nextInt());
        nums.add(rand.nextInt());
        nums.add(rand.nextInt());
        nums.add(rand.nextInt());
        nums.add(rand.nextInt());

        for (Integer num : nums) {
            System.out.println(num);
        }

    }
}
