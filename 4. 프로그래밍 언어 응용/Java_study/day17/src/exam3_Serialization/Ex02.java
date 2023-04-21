package exam3_Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.List;

public class Ex02 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("book.obj");
             ObjectInputStream ois = new ObjectInputStream(fis) ) {
            /**
            Book book1 = (Book)ois.readObject();
            Book book2 = (Book)ois.readObject();

            String str = (String)ois.readObject();
            */


            //System.out.printf("book1=%s%nbook2=%s%n", book1, book2);
            //System.out.println(str);

            List<Object> data = (List<Object>)ois.readObject(); // 순서가 중요하다보니 List, Map 을 주로 쓴다
            data.stream().forEach(System.out::println);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
