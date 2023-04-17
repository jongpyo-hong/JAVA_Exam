package exam2_Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex05 { // 스트림의 메서드 체이닝
    public static void main(String[] args) { // 문자열 -> 문자열의 길이(정수) -> 제곱 -> 출력하기
        String[] fruits = { "apple", "orange", "mango", "banana", "melon"};
            // 중간연산 - Stream 객체 반환
        Stream<Integer> stmt = Arrays.stream(fruits)
                                        .map(s -> s.length())
                                        .map(n-> n*n)
                                        .filter(n -> n >= 30);


        //최종 연산 - Stream 외의 값을 반환
        stmt.forEach(s-> System.out.println(s));
    }
}
