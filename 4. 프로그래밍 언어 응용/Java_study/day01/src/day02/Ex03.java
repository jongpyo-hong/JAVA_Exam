package day02;

public class Ex03 {
    public static void main(String[] args) {
        // boolean result = 10 > 5;
        //System.out.println(result);

        boolean result2 = true && true;
        boolean result3 = true || false;

        System.out.println(result2);
        System.out.println(result3);

        // 10이상 100 이하인 수 인가?
        int num = 20;
        boolean result = num >= 10 && num <= 100;

        System.out.println(result);
    }
}
