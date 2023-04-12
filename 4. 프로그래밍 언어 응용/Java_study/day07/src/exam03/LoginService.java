package exam03;

public class LoginService {
    public void Login(String id, String pw) throws IDNotFoundException, PWIncorrectException {
        // id = user, pw = 1234

        if (!id.equals("user")) {
            throw new IDNotFoundException("가입된 아이디가 아닙니다.");
        }

        if (!pw.equals("1234")) {
            throw new PWIncorrectException("비밀번호가 일치하지 않습니다.");
        }

        // 예외가 발생 하지않으면 로그인 성공
        System.out.println("로그인 성공");
    }
}
