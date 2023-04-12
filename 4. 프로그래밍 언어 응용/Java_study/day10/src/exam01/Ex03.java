package exam01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) throws FileNotFoundException {
        int total = 0;
        Scanner sc = new Scanner(new File("score.txt"));
        while(sc.hasNext()) { // 다음 라인이 있으면
            int score = sc.nextInt();
            total += score;
        }

        System.out.println("total : " + total);

    }
}
