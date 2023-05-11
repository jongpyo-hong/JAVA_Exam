package exam03.models.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JoinService {

    @Autowired // 매개변수, 스프링이 의존성을 자동으로 주입 해준다
    private JoinValidator validator;
    @Autowired
    //@Qualifier("mdao1")
    private Optional<MemberDao> opt; // Optional (Wrapper 클래스), 스프링이 의존성을 자동으로 주입 해준다
    public void join(Member member) {
        MemberDao memberDao = opt.get();
        validator.check(member);

        // 가입 처리
        memberDao.insert(member);

    }
}