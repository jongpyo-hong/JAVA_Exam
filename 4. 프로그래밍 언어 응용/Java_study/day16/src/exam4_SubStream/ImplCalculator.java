package exam4_SubStream;

public class ImplCalculator implements Calculator{
    @Override
    public long factorial(long num) {
        long sTime = System.nanoTime();
            long total = 1L;

            for (long i = 1; i <= num; i++) {
                total *= i;
            }

            return total;


    }
}
