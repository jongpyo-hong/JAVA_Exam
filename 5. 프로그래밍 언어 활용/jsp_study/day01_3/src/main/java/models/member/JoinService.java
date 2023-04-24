package models.member;

public class JoinService {
    public void join(Member member) {
        // 필수항목 체크 - userId
        String userId = member.getUserId();
        if (userId == null || userId.isBlank()) {
            throw new JoinValidationException("아이디를 입력하세요");
        }
    }
}
