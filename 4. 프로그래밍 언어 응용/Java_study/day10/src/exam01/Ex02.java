package exam01;

import java.util.Random;

public class Ex02 {
    public static void main(String[] args) {
        Random rand = new Random();

        int num1 = rand.nextInt();
        System.out.println(num1);

        double num2 = rand.nextDouble();
        System.out.println(num2);

        rand.ints().limit(10).forEach(System.out::println); // limit(10) = 열개로 제한
    }
}
