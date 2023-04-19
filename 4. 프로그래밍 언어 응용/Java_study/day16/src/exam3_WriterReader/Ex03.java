package exam3_WriterReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex03 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("20230419.log");
        BufferedReader br = new BufferedReader(fr)) {

            String line = null;
            while ((line = br.readLine()) != null) { // readLine() 한줄씩 읽는다
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
