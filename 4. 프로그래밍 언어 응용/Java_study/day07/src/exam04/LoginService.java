package exam04;

public class LoginService {
    public void login(String id, String pw) {
        if (!id.equals("user")) {
            throw new IDNotFoundException("가입되지 않은 아이디 입니다");
        }

        if (!pw.equals("1234")) {
            throw new PWIncorrectException("비밀번호가 일치하지 않습니다");
        }

        System.out.println("로그인 성공");
    }
}
