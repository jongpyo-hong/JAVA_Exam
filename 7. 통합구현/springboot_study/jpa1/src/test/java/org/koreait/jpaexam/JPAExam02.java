package org.koreait.jpaexam;

import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.koreait.constants.MemberType;
import org.koreait.entities.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
@Transactional
public class JPAExam02 {

    @Autowired
    private EntityManager em;

    @Test
    void ex01() {
        Member member = new Member();
        member.setUserId("user01");
        member.setUserNm("사용자01");
        member.setUserPw("123456");
        member.setMemberType(MemberType.ADMIN);
        member.setBirthDt(new Date());

        em.persist(member);
        em.flush();

        member.setUserNm("(수정)사용자01");
        em.flush();

        em.detach(member);

        member = em.find(Member.class, member.getUserNo());
        System.out.println(member);

    }
}
