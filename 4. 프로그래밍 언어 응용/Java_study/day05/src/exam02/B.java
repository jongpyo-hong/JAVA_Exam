package exam02;

public class B extends A { // B클래스가 A클래스를 상속받는다(A의 자원을 사용할 수 있다)
    int numB = 20;

    public B() { // C의 super()
        super(); // A()
        System.out.println("B 생성자");
    }
}
