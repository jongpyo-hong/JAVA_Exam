package exam01;

import java.util.Stack;

public class Ex03 {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();
        names.push("이름1"); // .push() : 배열에 ("")추가
        names.push("이름2");
        names.push("이름3");

        // .pop() : 배열의 마지막에 추가된 항목을 꺼내서 반환
        System.out.println(names.pop()); // 가장 나중에 만들어진 "이름3" 부터 꺼낸다
        System.out.println(names.pop());
        System.out.println(names.pop());

    }
}
