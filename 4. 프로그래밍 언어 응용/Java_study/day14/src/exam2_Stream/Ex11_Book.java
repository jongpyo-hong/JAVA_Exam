package exam2_Stream;

import java.util.Arrays;
import java.util.List;

public class Ex11_Book { // stream.distinct() - 중복제거 // 동등성 비교로 주소값으로 비교한다 (같으면 제거)
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("책1", "저자1"),
                new Book("책1", "저자1"),
                new Book("책2", "저자2"),
                new Book("책3", "저자3"),
                new Book("책4", "저자4")
        );

        List<Book> books2 = books.stream().distinct().toList();
        for (Book book : books2) { // Book 클래스에 hashCode(), equals() 재정의를 해야 중복 제거가능
            System.out.println(book);
        }
    }
}
