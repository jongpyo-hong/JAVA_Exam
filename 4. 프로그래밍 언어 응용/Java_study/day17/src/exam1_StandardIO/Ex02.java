package exam1_StandardIO;

import java.io.IOException;
import java.io.PrintStream;

public class Ex02 {
    public static void main(String[] args) throws IOException {

        System.setErr(new PrintStream("err.log")); // 표준출력을 err.log 파일을 생성해 입력한다

        // int result = 10 / 0;
        String str = null;
        str = str.toUpperCase();
    }
}
