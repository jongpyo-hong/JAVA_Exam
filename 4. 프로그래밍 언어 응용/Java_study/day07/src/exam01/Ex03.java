package exam01;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex03 {
    public static void main(String[] args) {
        // try~catch 코드 끝나기 직전 fis.close()가 호출
        try (FileInputStream fis = new FileInputStream("a.txt")) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
