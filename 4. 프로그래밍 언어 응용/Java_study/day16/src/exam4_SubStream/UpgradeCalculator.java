package exam4_SubStream;

public class UpgradeCalculator implements Calculator {

    private Calculator cal;

    public UpgradeCalculator(Calculator cal) {
        this.cal = cal;
    }

    @Override
    public long factorial(long num) {
        System.out.println("계산기능 업그레이드");

        long result = cal.factorial(num);

        return result;
    }
}
