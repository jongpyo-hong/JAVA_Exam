package day02;

public class Ex10 {
    public static void main(String[] args) {
        int total = 0, num = 1;

        do {
            total += num;
            num++;
        } while (num <= 100);
        System.out.println("합계 : " + total);
    }
}
