package exam01;

public abstract class Calculator2 {
    public int num = 10;

    public abstract int add(int num1, int num2);
    public abstract int minus(int num1, int num2);

    public void commonMethod() {
        System.out.println("공통메서드2");
    }
}
