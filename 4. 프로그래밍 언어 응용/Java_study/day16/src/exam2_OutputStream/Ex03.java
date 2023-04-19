package exam2_OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03 {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("20230419.log",true)) {
            for (char ch = 'A'; ch <= 'Z'; ch++) {
                fos.write(ch);
            }
            fos.write('\n');

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
