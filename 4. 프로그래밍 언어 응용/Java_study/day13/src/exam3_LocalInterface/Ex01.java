package exam3_LocalInterface;

public class Ex01 {
    public static void main(String[] args) {
        Calculator cal = new Calculator(){
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };

        add(cal);

        add(new Calculator() {
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        });
    }

    public static void add(Calculator cal) {
        int result = cal.add(10,20);
        System.out.println(result);
    }

    public static Calculator getCalculator() {
        Calculator cal = new Calculator() {
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };
        return cal;
    }
}
