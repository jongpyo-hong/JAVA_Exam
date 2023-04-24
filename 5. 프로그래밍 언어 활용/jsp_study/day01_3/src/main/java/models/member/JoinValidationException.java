package models.member;

public class JoinValidationException extends RuntimeException {
    public JoinValidationException(String message) { // 사용자 예외 생성
        super(message);
    }
}
