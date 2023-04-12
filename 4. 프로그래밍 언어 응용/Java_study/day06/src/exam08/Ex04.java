package exam08;

public class Ex04 {
    public static void main(String[] args) {
        A a = new A() {
            public void method() {
                System.out.println("A 클래스의 메서드");
            }
        };
        a.method();
    }
}
