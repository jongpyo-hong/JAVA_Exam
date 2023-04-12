package exam02;

public class Ex06 {
    public static void main(String[] args) {
        long result1 = add(10.123, 20);
        long result2 = add(11.2F, 100L);
        System.out.println(result1);
        System.out.println(result2);

    }

    public static long add(Number num1, Number num2) { // Integer의 상위 클래스 Number 사용
        long result = num1.longValue() + num2.longValue();
        return result;
    }
}
