package day02;

public class Ex04 {
    public static void main (String[] args) {
        int num = 10;
        boolean result = ++num > 10 || (num = num + 10) >= 10;
        System.out.println(num);
    }
}
