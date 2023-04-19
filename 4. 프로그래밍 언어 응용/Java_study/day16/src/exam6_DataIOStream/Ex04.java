package exam6_DataIOStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("scores.dat");
            DataInputStream dis = new DataInputStream(fis)) {

            int total = 0;
            int count = 0;
            try {
                while (true) {
                    int score = dis.readInt();
                    total += score;
                    count++;
                }

            } catch (IOException e) { // 데이터를 다 읽은 상태
                System.out.println("합계 : " + total );
                System.out.println("평균 : " + Math.round(total / count));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
