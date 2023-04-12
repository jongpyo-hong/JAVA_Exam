package exam01;

public abstract class Calculator {
    public int num = 10;

    public abstract int add(int num1, int num2);
    public abstract int minus(int num1, int num2);

    public void commonMethod() { // 추상클래스의 공통(인스턴스)메서드
        System.out.println("공통 메서드");
    }
}
