package exam02;

public class Ex02 {
    public static void main(String[] args) {
        int re = add(10, 20); // main()에 정의된 지역변수
       // System.out.println(re);
    }

    static int add(int num1, int num2) { // 코드 -> num1 = 10, num2 = 20, 지역
        int result = num1 + num2; // 함수 지역에서만 활성화 되는 변수 - 지역 변수

        return result;
    }

    static int add(int num2, int num3, int num4) {
        int result = num3 + num4;

        return result;
    }
}
