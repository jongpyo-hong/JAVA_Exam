package models.member;
import validators.Validator;
import javax.servlet.http.HttpServletRequest;

public class LoginValidator implements Validator<HttpServletRequest> {

    private MemberDao memberDao;

    public LoginValidator(MemberDao memberDao) {
        this.memberDao = memberDao;
    }
    public void check(HttpServletRequest request) {
        String userId = request.getParameter("userId");
        String userPw = request.getParameter("userPw");

        requiredCheck(userId, new LoginValidationException("아이디를 입력하세요"));
        requiredCheck(userPw, new LoginValidationException("비밀번호를 입력하세요"));

        /** 아이디 조회시 등록된 회원이 아니면 예외 발생 */
        Member member = memberDao.get(userId);
        if (member == null) {
            throw new LoginValidationException("가입되지 않은 회원입니다");
        }

        /** 비밀번호 일치여부 테스트 */
        if (!userPw.equals(member.getUserId())) {
            throw new LoginValidationException("아이디 또는 비밀번호가 일치하지 않습니다");
        }

    }

}
