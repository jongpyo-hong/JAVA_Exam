package exam01;

public class Ex05 {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(System.identityHashCode(str));
        str += "def";
        System.out.println(System.identityHashCode(str));

        str += "ghi";
        System.out.println(System.identityHashCode(str));

        str += "jkl";
        System.out.println(System.identityHashCode(str));
        // 문자열을 정의하면 상수로 정의되서 새로운 문자열을 결합하면 주소값이 바뀐다


    }
}
