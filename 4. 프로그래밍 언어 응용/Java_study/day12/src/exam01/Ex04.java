package exam01;

import java.util.LinkedList;
import java.util.Queue;

public class Ex04 {
    public static void main(String[] args) {
        Queue<String> names = new LinkedList<>(); // Queue는 LinkedList의 구현체
        names.offer("이름1"); // .offer() : 배열에 ("") 추가
        names.offer("이름2");
        names.offer("이름3");

        System.out.println(names.poll()); // .poll() : 배열에 들어간 항목을 들어갔던 순서대로 리턴한다
        System.out.println(names.poll());
        System.out.println(names.poll());
    }

}
