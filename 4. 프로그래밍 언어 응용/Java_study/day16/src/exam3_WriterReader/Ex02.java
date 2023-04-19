package exam3_WriterReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Reader.*;

public class Ex02 {
    public static void main(String[] args) throws IOException {
        // int ch = System.in.read()
        // System.out.println((char)ch + ", " + ch);

        Reader isr = new BufferedReader(new InputStreamReader(System.in));
        int ch = isr.read();
        System.out.println((char)ch + ", " + ch);
    }
}
