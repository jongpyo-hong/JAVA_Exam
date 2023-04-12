package exam04;

public abstract class Calculator { // abstract 추상클래스

    public int num = 10;
    public abstract int add(int num1, int num2); // 메서드의 구현체가 없다
    public abstract int minus(int num1, int num2);

    public void commonMethod() { // abstract가 아니라도 공통 기능으로 하위클래스가 상속받아 사용할 수 있다
        System.out.println("공통기능");
    }
}
