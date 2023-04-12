package exam06;

public class Ex01 {
    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner in = out.new Inner();
        in.innerMethod();

        Outer.Inner.staticMethod();
    }
}
