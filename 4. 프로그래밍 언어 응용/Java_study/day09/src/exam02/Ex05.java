package exam02;

public class Ex05 {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(10);
        Integer num2 = Integer.valueOf(10);

        System.out.println("num1 : " + System.identityHashCode(num1));
        System.out.println("num2 : " + System.identityHashCode(num2));
        // 주소의 값이 같다 (valueOf()로 비교)
    }
}
