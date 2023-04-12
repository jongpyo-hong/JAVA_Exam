package exam08;

public class Ex01 {
    public static void main(String[] args) {
        Outer out = new Outer();

        Calculator cal = out.method(5);

        int result1 = cal.add(10, 20); // 10 + 20 + 5 // num3 -> 상수
        System.out.println(result1);

        int result2 = cal.add(30, 40);
        System.out.println(result2);

    }
}
