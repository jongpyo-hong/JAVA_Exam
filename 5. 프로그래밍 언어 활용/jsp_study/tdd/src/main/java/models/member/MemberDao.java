package models.member;

import java.util.HashMap;
import java.util.Map;

public class MemberDao {
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
