package exam4_Lambda;

@FunctionalInterface// 메서드가 2개이상이 되면 오류가 발생한다
public interface Calculator {
    int add(int num1, int num2);
}
