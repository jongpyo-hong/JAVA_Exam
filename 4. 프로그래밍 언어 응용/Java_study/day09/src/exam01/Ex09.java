package exam01;

public class Ex09 {
    public static void main(String[] args) {
        String str1 = "abc"; // 문자열 상수
        String str2 = new String("abc"); // 객체
        checkEquals(str1, str2);

        String str3 = new StringBuffer("abc").toString();
        checkEquals(str1, str3);
    }

    static void checkEquals(String str1, String str2) {
        //System.out.println(str1 == str2); // 동일성 비교 , String 클래스는 ==로 비교하면 오류가 나기쉽다
        System.out.println(str1.equals(str2)); // 동등성 비교, equals로 비교해야한다
    }
}
