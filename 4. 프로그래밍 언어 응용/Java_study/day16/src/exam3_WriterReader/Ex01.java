package exam3_WriterReader;

import java.io.FileWriter;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("test3.txt")) {
            fw.write("안녕하세요");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
