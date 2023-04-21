package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex04 {
    public static void main(String[] args) {
        Random rand = new Random();
        int num1 = rand.nextInt(20) + 1;
        int num2 = rand.nextInt(20) + 1;

        while(num1==num2) {
            num2 = rand.nextInt(20)+1;
        }

        isSosu(num1);
        System.out.println("------------------------------------------");
        isGcd(num1, num2);
        System.out.println("------------------------------------------");
        isLcm(num1, num2);
    }


    // 소수
    public static void isSosu(int num1) {
        int count = 0;
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(num1 + " 은 소수입니다");
        } else {
            System.out.println(num1 + "은 소수가 아닙니다");
        }
        count = 0;
    }

    // 공약수
    public static void isGcd(int num1, int num2) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= Math.max(num1, num2); i++) {
            if ((num1 % i == 0) && (num2 % i == 0)) {
                arr.add(i);
            }
        }
        System.out.println(num1 + ", " + num2 + " 의 공약수는");
        System.out.println(arr);
        System.out.println();
        int gcd = arr.stream().mapToInt(n -> n).max().orElse(1);
        System.out.println(num1 + ", " + num2 + " 의 최대 공약수는 " + gcd);
    }

    // 공배수
    public static void isLcm(int num1, int num2) {
        int num3 = num1 > num2 ? num1 : num2;
        List<Integer> arr = new ArrayList<>();

        while(arr.size() <= 10) {
            if ((num3%num1==0) && (num3%num2==0)) {
                arr.add(num3);
            }
            num3++;
        }
        System.out.println(num1 + ", " + num2 + " 의 공배수는 ");
        System.out.println(arr);
        System.out.println();
        int Lcm = arr.stream().mapToInt(n->n).min().orElse(1);
        System.out.println(num1 + ", " + num2 + " 의 최소공배수는 ");
        System.out.println(Lcm);

    }
}