package exam3_Serialization;

import java.io.Serializable;

public class Book implements Serializable {
    private static final long serialVersionUID = 1L; // 고정된 UID
    private String title;
    private transient String bookName; // transient : 직렬화 제외
    private String author;




    public Book(String title, String bookName) {
        this.title = title;
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", bookName='" + bookName + '\'' +
                '}';
    }


}
