package exam03;

public class IDNotFoundException extends Exception { // 엄격한 예외
    public IDNotFoundException(String message) {
        super(message); // 상위클래스의 생성자 super
    }
}
