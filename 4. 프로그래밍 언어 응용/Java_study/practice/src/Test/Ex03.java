package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        // 공약수, 공배수, 소수

        // 소수 : 1과 본인으로만 나눌수 있는 수
        int count = 0;

        for (int i = 1; i<= 10; i++) {
            for (int j = 1; j <= i; j++){
                if(i%j==0) {
                    count++;
                }
            }
            if(count==2) {
                System.out.println(i + "는 소수 입니다");
            } else {
                System.out.println(i + "는 소수가 아닙니다");
            }
            count=0;
        }


        // 공약수
        int num1 = 24;
        int num2 = 16;

        List<Integer> arr = new ArrayList<Integer>();
        for (int i =1; i <= Math.max(num1,num2); i++) {
            if(num1%i==0 && num2%i==0) {
                arr.add(i);
            }
        }

        System.out.println(arr);
        int gcd = arr.stream().mapToInt(n->n).max().orElse(1);
        System.out.println("최대공약수는 " + gcd);
        System.out.println("최소공배수는 " + (num1 * num2) / gcd);

    }
}