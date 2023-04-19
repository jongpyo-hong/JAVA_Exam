package exam4_SubStream;

public class Ex01 {
    public static void main(String[] args) {
        ImplCalculator cal1 = new ImplCalculator();
        RecCalculator cal2 = new RecCalculator();

        long sTime = System.nanoTime();
        long result1 = cal1.factorial(10);

        long eTime = System.nanoTime();
        System.out.println("cal1 걸린시간 : " + (eTime - sTime));
        System.out.println("cal1 = " + result1);

        sTime = System.nanoTime();
        long result2 = cal2.factorial(10);

        eTime = System.nanoTime();
        System.out.println("cal2 걸린시간 : " + (eTime - sTime));
        System.out.println("cal2 = " + result2);

    }
}
