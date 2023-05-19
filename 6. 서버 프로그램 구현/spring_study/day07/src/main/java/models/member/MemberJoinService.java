package models.member;

import controllers.JoinForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberJoinService {
    @Autowired // 클래스 위 @RequiredArgsConstructor 를 사용해도 상관없다
    private MemberDao memberDao;

    public void join(JoinForm joinForm) {

        memberDao.insert(joinForm);
    }
}
