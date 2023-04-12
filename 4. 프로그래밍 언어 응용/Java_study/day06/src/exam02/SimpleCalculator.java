package exam02;

public class SimpleCalculator implements Calculator { // 인터페이스는 implements로 클래스를 상속한다
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}
