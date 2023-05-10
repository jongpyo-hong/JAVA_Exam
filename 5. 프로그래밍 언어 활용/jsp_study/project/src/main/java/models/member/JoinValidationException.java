package models.member;

public class JoinValidationException extends RuntimeException {
    public JoinValidationException(String message) {
        super(message);
    }
}
