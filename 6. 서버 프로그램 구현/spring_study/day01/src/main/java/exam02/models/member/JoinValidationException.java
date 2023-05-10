package exam02.models.member;

public class JoinValidationException extends RuntimeException {
    public JoinValidationException(String message) {
        super(message);
    }
}