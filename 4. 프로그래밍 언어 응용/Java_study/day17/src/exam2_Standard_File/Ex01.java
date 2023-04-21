package exam2_Standard_File;

import java.io.File;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) throws IOException {
        // String filePath = "D:" + File.separator + "tmp" + File.separator + "file.txt"; // .separator : OS에 맞게 파일 구분 문자변환
        // System.out.println(filePath);

        //File file = new File(filePath); // 파일 생성자
        //file.createNewFile(); // 빈파일 생성

        String dirPath = "D:" + File.separator + "tmp";
        File.createTempFile("tmp", ".log", new File(dirPath)); // .createTempFile 임시파일


    }
}
