package exam2_OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {

        try(FileOutputStream fos = new FileOutputStream("test2.txt")) {
            /**for (char ch = 'A'; ch <= 'Z'; ch++) { // char도 int이기 때문에 가능 (아스키 코드)
                fos.write(ch);
            }*/

            byte[] chars = {65, 66, 67, 68};
            fos.write(chars);

            fos.write('안');
            fos.write('녕');
            fos.write('하');
            fos.write('세');
            fos.write('요');


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
