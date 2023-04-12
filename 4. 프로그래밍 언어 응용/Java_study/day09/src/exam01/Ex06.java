package exam01;

public class Ex06 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(100);
        System.out.println(System.identityHashCode(sb));

        StringBuffer sb2 = sb.append("abc");
        System.out.println(System.identityHashCode(sb2));

        StringBuffer sb3 = sb2.append("def");
        System.out.println(System.identityHashCode(sb3));

        StringBuffer sb4 = sb3.append("ghi");
        System.out.println(System.identityHashCode(sb4));

        StringBuffer sb5 = sb4.append("jkl");
        System.out.println(System.identityHashCode(sb5));

        sb.append("abc").append("def").append("ghi").append("jkl"); // 메서드 체이닝

        // 일반 String 클래스는 문자열을 결합 할때마다 주소가 바뀌지만 StringBeffer를 쓰면 주소값이 안바뀐다

        String str = sb.toString();
        System.out.println(str);
        System.out.println(System.identityHashCode(str));
    }
}
