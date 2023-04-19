package exam1_InputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("test1.txt")) {
            byte[] buffer = new byte[4];
            while(fis.available() > 0) {
                int cnt = fis.read(buffer); // 반환값 : 읽어본 바이트 수
                for (int i = 0; i < cnt; i++) {
                    System.out.print((char)buffer[i]);
                }

                /**
                for (byte b : buffer) {
                    System.out.print((char)b);
                }*/
                System.out.println();
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
