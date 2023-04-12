package exam07;

public class Outer {
    private int num = 10;
    static class Inner {
        public void innerMethod() {

            //System.out.println(num);
            System.out.println("정적 내부 클래스");
        }
    }
}
