package day02;

public class Ex09 {
    public static void main(String[] args) {
        int total = 0, num = 1; // 쉼표로 자료형을 명시하지 않아도 다른 변수를 사용가능

        while(num <= 100) {
            total += num; // total = total + num;
            num++; // num = num + 1;
        }
        System.out.println("합계 : " + total);

        /**
        int total = 0;
        total += 1;
        total += 2;*/
        
        
        
    }
}
