package models.member;

public class LoginValidationException extends RuntimeException{
    public LoginValidationException(String message) {
        super(message);
    }
}
