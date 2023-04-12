package exam06;

public class Outer {
    private int num = 10; // Outer.this.num


    class Inner {
        private int num = 20;
        private static int num2 = 30;
        public void innerMethod() {

            System.out.println(num); // 20
            System.out.println(Outer.this.num);
            System.out.println("인스턴스 내부 클래스 Inner");
        }
        public static void staticMethod() {
            System.out.println("정적 메서드");
        }
    }
}
