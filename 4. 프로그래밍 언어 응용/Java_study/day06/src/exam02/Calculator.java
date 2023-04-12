package exam02;

public interface Calculator {

    int num = 10; // public static final int num = 10; // 정적 상수
    int add(int num1, int num2); // public abstract를 정의하지 않아도, 자동으로 컴파일 된다
                                 // public abstract int add();

    public static void staticMethod() {

    }
}
