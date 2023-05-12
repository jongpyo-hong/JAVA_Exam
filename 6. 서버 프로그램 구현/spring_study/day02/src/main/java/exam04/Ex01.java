package exam04;

public class Ex01 {
    public static void main(String[] args) {
        Calculator recCal = new ProxyCalculator(new RecCalculator());
        Calculator simCal = new ProxyCalculator(new SimpleCalculator());

        long result1 = simCal.factorial(20);
        System.out.printf("simCal=%d%n", result1);


        long result2 = recCal.factorial(20);
        System.out.printf("recCal=%d%n", result2);


    }
}
