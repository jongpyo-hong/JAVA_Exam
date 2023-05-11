package exam03.models.member;

import exam03.comfig.ManualBean;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
@ManualBean
@Repository
public class MemberDao { // memberDao
    private static Map<String, Member> members = new HashMap<>();

    /**
     * 회원 추가
     * @param member
     */
    public void insert(Member member) {
        members.put(member.getUserId(), member);
    }

    /**
     * 회원 조회
     * @param userId
     */
    public Member get(String userId) {
        return members.get(userId);
    }
}
