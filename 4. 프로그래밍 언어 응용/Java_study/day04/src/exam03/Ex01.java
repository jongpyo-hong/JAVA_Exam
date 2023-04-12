package exam03;

import exam02.A;

public class Ex01 {
    public static void main(String[] args) {
        A a = new A();
        a.num = 20;
        System.out.println(a.num);
        
        // a.num2 = 10; - 동일한 패키지가 아니라 접근 불가

        B b = new B();
        b.printNum4();
    }
}
