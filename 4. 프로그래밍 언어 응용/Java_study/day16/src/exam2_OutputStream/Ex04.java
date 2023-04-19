package exam2_OutputStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Ex04 {
    public static void main(String[] args) { // 메모리 기반의 OutputStream
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        bos.writeBytes(new byte[] {65, 66, 67, 68, 69});

        byte[] buffer = bos.toByteArray();
        //System.out.println(Arrays.toString(buffer));
        ByteArrayInputStream bis = new ByteArrayInputStream(buffer);
        int ch = 0;
        while((ch = bis.read()) != -1) {
            System.out.print((char)ch);
        }
    }
}
