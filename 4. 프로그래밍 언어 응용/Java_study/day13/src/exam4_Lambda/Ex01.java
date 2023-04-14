package exam4_Lambda;


public class Ex01 { // 람다식 함수 (Calculator)
    public static void main(String[] args) {
        /**
        Calculator cal = new Calculator() {
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };
         */

        /**
         Calculator cal = (a, b) -> a + b; // 람다식은 인터페이스에 추상메서드가 하나여야만 사용할 수 있다

        int c = 20;
        Calculator cal2 = (a, b) -> {
            //c = 30; // 지역변수의 상수화 final int c...(재정의 불가)
            return a + b + c;
        };
         */

        Calculator cal = (a,b) -> a + b;
        int result = cal.add(10, 20);
        System.out.println(result);

        add(cal);

        add((a, b) -> a + b);
    }

    public static void add(Calculator a) {
        int result = a.add(10, 20);
        System.out.println(result);
    }
}
