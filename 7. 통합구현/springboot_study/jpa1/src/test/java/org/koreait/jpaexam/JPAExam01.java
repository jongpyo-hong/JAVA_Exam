package org.koreait.jpaexam;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.koreait.entities.Member;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
@TestPropertySource(locations = "classpath:application-test.properties")
public class JPAExam01 {

    @Autowired
    private EntityManager em;

    @BeforeEach()
    void init() {
        Member member = new Member();
        member.setUserNo(1L);
        member.setUserId("user01");
        member.setUserNm("사용자01");
        member.setUserPw("123456");

        em.persist(member); // 영속성 상태 -> 변화감지
        em.flush(); // 변화 상태를 DB에 반영

        //em.detach(member);
    }

    @Test
    void ex01() {
        Member member = new Member();
        member.setUserNo(1L);
        member.setUserId("user01");
        member.setUserNm("사용자01");
        member.setUserPw("123456");

        em.persist(member); // 영속성 상태 -> 변화감지
        em.flush(); // 변화 상태를 DB에 반영

        em.detach(member); // 영속성 상태 분리 -> 변화 감지 X

        member.setUserNm("(수정)사용자01"); // 수정
        em.flush(); // 변화 상태를 DB에 반영

        em.merge(member); // 분리된 영속성 -> 변화 감지 O
        em.flush(); // 변화 상태를 DB에 반영

        //em.remove(member); // 영속성 상태 -> 제거 상태
        //em.flush(); // 변화 상태를 DB에 반영 (DELETE)
    }

    @Test
    void ex02() {
        Member member = em.find(Member.class, 1L);
        System.out.println(member);

        // 엔티티 기준의 쿼리문 (JPQL)
        String sql = "SELECT m FROM Member m WHERE m.userId=:userId";

        TypedQuery<Member> tq = em.createQuery(sql, Member.class);
        tq.setParameter("userId", "user01");

        Member mem = tq.getSingleResult();
        System.out.println(mem);
    }
}
