package exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("a.txt");
            // throw new FileNotFoundException();
            
            // 파일 읽기작업

            System.out.println("자원 해제 완료");
            return; // 함수종료
        } catch (IOException e) { // FileNotFoundException e = new FileNotFoundException()
            //System.out.println("예외처리");
            //e.printStackTrace();
        } finally { // 예외가 발생하든 안하든 항상 수행되는 코드
            try{
                fis.close();
            } catch (IOException | NullPointerException e) {
                e.printStackTrace();
            }
            System.out.println("예외가 발생하든 안하든 항상 실행되는 코드");
        }

        System.out.println("매우 중요한 코드");
    }
}
