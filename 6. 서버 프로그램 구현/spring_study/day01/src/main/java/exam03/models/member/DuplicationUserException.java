package exam03.models.member;

public class DuplicationUserException extends RuntimeException {
    public DuplicationUserException() {
        super("이미 가입된 회원입니다.");
    }
}