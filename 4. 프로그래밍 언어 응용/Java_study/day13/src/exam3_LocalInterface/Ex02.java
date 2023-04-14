package exam3_LocalInterface;

public class Ex02 {
    public static void main(String[] args) {
        Calculator cal = new Calculator() { // cal = Calculator 의 주소

            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        }; // 인터페이스에 정의된 메서드를 객체로 만드는 과정

        add(cal); // 만들어진 객체를 변수로 사용

        add(new Calculator() {
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        });
    }

    public static void add(Calculator cal) { // main()내에 add() 함수 생성
        int result = cal.add(10,20);
        System.out.println(result);
    }

}
