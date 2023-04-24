package practiceMethod;

import java.util.Scanner;

public class Ex01_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        isgGogo(num1);



    }
    public static void isgGogo(int num1) {
        for (num1 = 1; num1 < 10; num1++) {
            System.out.println("=========" + num1 + "단==========");
            for(int i = 1; i < num1; i++) {
                System.out.println(num1 + "X" + i + "=" + (num1*i));
            }
        }
    }
}
