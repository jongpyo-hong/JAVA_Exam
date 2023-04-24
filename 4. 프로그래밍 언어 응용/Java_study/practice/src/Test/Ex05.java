package Test;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        isGcd(n1,n2);
    }

    public static void isGcd(int n1, int n2) {
        // 최대공약수
        int n3 = Math.max(n1, n2);
        int n4 = Math.min(n1, n2);

        while (n4 != 0) {
            int r = n3 % n4;
            n3 = n4;
            n4 = r;
        }

        System.out.println(n3);
        System.out.println((n1*n2)/n3);
    }



        // 재귀함수
        public static int isGcd2(int n1, int n2) {
            if(n1%n2 ==0) {
                return n2;
            }
            return isGcd2(n2, n1%n2);
        }
}


