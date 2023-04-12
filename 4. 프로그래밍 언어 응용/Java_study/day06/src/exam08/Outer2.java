package exam08;

public class Outer2 {
    public Calculator method(int num3) {
        return new Calculator() {
            public int add(int num1, int num2) {

                // final int num3 -> 지역변수의 상수화
                // num3 = 40; -> 초기화를 할 수없다
                return num1 + num2 + num3;
            }
        };

    }
}
