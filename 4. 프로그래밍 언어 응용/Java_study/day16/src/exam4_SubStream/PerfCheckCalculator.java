package exam4_SubStream;

public class PerfCheckCalculator implements Calculator {

    private Calculator cal;

    public PerfCheckCalculator(Calculator cal) {
        this.cal = cal;
    }

    @Override
    public long factorial(long num) {
        long sTime = System.nanoTime();
        try {
            long result = cal.factorial(num);

            return result;
        } finally {
            long eTime = System.nanoTime();
            System.out.println("걸린시간 : " + (eTime - sTime));
        }
    }
}
