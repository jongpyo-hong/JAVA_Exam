package exam06;

public class Ex03 {
    public static void main(String[] args) {
        Book book1 = new Book("제목","저자");
        System.out.println(book1); // book1.toString();

        System.out.println("hashCode = " + book1.hashCode());
    }
}
