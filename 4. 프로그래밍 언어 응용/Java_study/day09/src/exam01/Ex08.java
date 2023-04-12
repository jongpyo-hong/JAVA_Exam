package exam01;

public class Ex08 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        System.out.println("str1 : " + System.identityHashCode(str1));
        System.out.println("str2 : " + System.identityHashCode(str2));
        System.out.println("str1 == str2 : " + (str1 == str2));

        int num1 = 10;
        int num2 = 10; // 리터럴 상수 10 - 주소값이 1개만 있다
        System.out.println(num1 == num2); // 주소값을 비교하니 true
    }
}
