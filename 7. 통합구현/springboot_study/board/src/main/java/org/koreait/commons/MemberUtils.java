package org.koreait.commons;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.koreait.commons.constants.MemberType;
import org.koreait.entitis.Member;
import org.koreait.models.member.MemberInfo;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MemberUtils {

    private final HttpSession session;

    public boolean isLogin() {
        return getMember() != null;
    } // 로그인 여부

    public boolean isAdmin() { // 관리자 여부

        return isLogin() && getMember().getType() == MemberType.ADMIN;
    }

    public MemberInfo getMember() { // 회원 정보 조회
        MemberInfo memberInfo = (MemberInfo)session.getAttribute("memberInfo");

        return memberInfo;
    }

    public Member getEntity() { // 매핑을 위한 엔티티
        if (isLogin()) {
            Member member = new ModelMapper().map(getMember(), Member.class);
            return member;
        }

        return null;
    }
}
