package exam08;

public class Ex03 {
    public static void main(String[] args){
        int num3 = 30;
        Calculator cal = new Calculator() {
            public int add(int num1, int num2) {
                return num1 + num2 + num3;
            }
        };
        int result = cal.add(10, 20);
        System.out.println(result);
    }
}
