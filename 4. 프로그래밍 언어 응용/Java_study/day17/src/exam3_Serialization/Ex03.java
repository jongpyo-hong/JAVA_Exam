package exam3_Serialization;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Ex03 {
    public static void main(String[] args) {
        Map<String, Object> data = new HashMap<>();
        data.put("book1", new Book("제목1", "이름1"));
        data.put("book2", new Book("제목2", "이름2"));
        data.put("str","문구");

        try(FileOutputStream fos = new FileOutputStream("data.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(data);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
