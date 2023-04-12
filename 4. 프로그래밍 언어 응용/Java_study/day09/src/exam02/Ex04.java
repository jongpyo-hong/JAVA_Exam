package exam02;

public class Ex04 {
    public static void main(String[] args) {
        Integer num1 = new Integer(10);
        Integer num2 = new Integer(10);

        System.out.println("num1 : " + System.identityHashCode(num1));
        System.out.println("num2 : " + System.identityHashCode(num2));
        // 주소의 값이 다르다 (새로운 객체가 2개(num1, num2) 생성되었기 때문)
    }
}
