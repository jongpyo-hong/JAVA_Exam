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


        // 공배수
        int n1 = 22;
        int n2 = 44;
        int n3 = n1 > n2 ? n1:n2;

        List<Integer> arr2 = new ArrayList<Integer>();
        while(arr2.size() <= 10) {
            if (n3%n1==0&& n3%n2==0) {
                arr2.add(n3);
            }
            n3++;
        }
        System.out.println(arr2);
        int lcm = arr2.stream().mapToInt(n->n).min().orElse(1);
        System.out.println("최소공배수는 " + lcm);

    }
}