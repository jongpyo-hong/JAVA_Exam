package exam05;

public class SimpleCalculator implements Calculator {
    @Override
    public long factorial(long num) {
        long result = 1;
        for (long i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

}
