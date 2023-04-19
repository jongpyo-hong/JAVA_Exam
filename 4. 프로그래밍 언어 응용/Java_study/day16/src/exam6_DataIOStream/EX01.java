package exam6_DataIOStream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EX01 {
    public static void main(String[] args) { // FileInputStream(data.dat) : data.dat 작성
        try (FileOutputStream fos = new FileOutputStream("data.dat");
             DataOutputStream dos = new DataOutputStream(fos)) {

            dos.writeInt(100);
            dos.writeBoolean(true);
            dos.writeUTF("안녕하세요");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
