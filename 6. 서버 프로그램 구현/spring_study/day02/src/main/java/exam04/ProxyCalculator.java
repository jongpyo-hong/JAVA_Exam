package exam04;

public class ProxyCalculator implements Calculator{
    private Calculator calculator;

    public ProxyCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public long factorial(long num) {

        long stime = System.nanoTime(); // 공통 추가 기능
        try {

            long result = calculator.factorial(num); // 핵심 기능 대신 수행

            return result;
        } finally {
            long etime = System.nanoTime(); // 공통 추가 기능
            System.out.printf("걸린시간 : %d%n", etime - stime);
        }
    }
}
