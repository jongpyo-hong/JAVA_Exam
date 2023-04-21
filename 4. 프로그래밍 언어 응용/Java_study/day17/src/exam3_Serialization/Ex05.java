package exam3_Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Ex05 {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("data2.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(new Book("제목1", "이름1"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
