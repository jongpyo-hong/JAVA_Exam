package exam6_DataIOStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex02 {
    public static void main(String[] args) { // FileOutputStream(data.dat) data.dat 읽기
        try(FileInputStream fis = new FileInputStream("data.dat");
            DataInputStream dis = new DataInputStream(fis)) {

            int num = dis.readInt();
            boolean result = dis.readBoolean();
            String message = dis.readUTF();
            System.out.println("num = " + num + ", result = " + result + ", message = " + message);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
