package models.member;

public class JoinService {
    private Member member;
    private JoinValidator joinValidator;

    public JoinService(JoinValidator joinValidator) {
        this.joinValidator = joinValidator;
    }

    public void join(Member member) {
        joinValidator.check(member);
    }
}
