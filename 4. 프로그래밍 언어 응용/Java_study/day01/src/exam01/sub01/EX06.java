package exam01.sub01;

public class EX06 {
    public static void main(String[] args) {
        byte num1 = 10;
        int num2 = num1; // byte -> int (묵시적 형변환)
        long num3 = num2; // int -> long (묵시적 형변환)

        
        double num4 = num3; // long -> double (묵시적 형변환), 실수는 정수를 항상 포함
        float num5 = num3; //
        
    }
}
