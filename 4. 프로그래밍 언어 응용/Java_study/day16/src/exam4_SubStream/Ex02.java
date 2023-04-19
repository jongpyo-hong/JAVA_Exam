package exam4_SubStream;

public class Ex02 {
    public static void main(String[] args) {
        Calculator cal1 = new UpgradeCalculator(new PerfCheckCalculator(new ImplCalculator()));
        Calculator cal2 = new PerfCheckCalculator(new RecCalculator());


        long result1 = cal1.factorial(10);
        System.out.println("cal1 = " + result1);

        long result2 = cal2.factorial(10);
        System.out.println("cal2 = " + result2);

    }
}
