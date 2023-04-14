package exam4_Lambda;

public class Ex02 {
    public static void main(String[] args) {
        Calculator cal = (a, b) -> a + b; // 자료형, 중괄호, return 값을 생략한다, 변수명도 a,b로 입력 가능하다

        add(cal); // 매개변수로 쓰일 때

        add((a,b) -> a + b);

        Calculator cal2 = getCalculator(); // 반환 값으로 쓰일 때
        int result = cal2.add(10,20);
        System.out.println(result);
    }

    public static void add(Calculator cal) {
        int result = cal.add(10,20);
        System.out.println(result);
    }

    public static Calculator getCalculator() {
        /**Calculator cal = (a, b) -> a + b;
        return cal; */
        return (a,b) -> a+b;
    }
}
