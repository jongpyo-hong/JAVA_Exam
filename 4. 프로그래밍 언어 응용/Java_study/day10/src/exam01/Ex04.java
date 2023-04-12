package exam01;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            while(true) {
                System.out.println("두 수를 입력 하세요 ex) 10 20 | 중단 : q입력");
                String line = sc.nextLine();
                if (line.equals("q")) {
                    break;
                }

                String[] nums = line.split(" ");
                int num1 = Integer.parseInt(nums[0]);
                int num2 = Integer.parseInt(nums[1]);
                System.out.println("두 수의 합 = " + (num1 + num2));
            }
    }
}
