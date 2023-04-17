package exam2_Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex13_Book2 { // 다중 조건 정렬 thenComparing
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("책2", "저자2"),
                new Book("책3", "저자3"),
                new Book("책1", "저자1"),
                new Book("책1", "저자1"),
                new Book("책1", "저자9"),
                new Book("책4", "저자4")
        );

        books.stream().sorted().forEach(System.out::println); // 기준이 있어야 한다(implements Comparable)
        System.out.println("==================================");

        books.stream().sorted().forEach(System.out::println);
    }
}
