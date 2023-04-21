package exam3_Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex06 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("data2.obj");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            Book book = (Book)ois.readObject();
            System.out.println(book);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
