package exam5_Decorate;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {
        long sTime = System.currentTimeMillis();
        try (FileInputStream fis = new FileInputStream("docs.zip");
             FileOutputStream fos = new FileOutputStream("copied_docs.zip")) {

            while(fis.available() > 0) {
                fos.write(fis.read());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        long eTime = System.currentTimeMillis();
        System.out.println("걸린시간 = " + (eTime - sTime));
    }
}
