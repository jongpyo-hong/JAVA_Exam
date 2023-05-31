package org.koreait.jpaexam;

import com.querydsl.core.BooleanBuilder;
import org.junit.jupiter.api.Test;
import org.koreait.constants.MemberType;
import org.koreait.entities.Member;
import org.koreait.entities.QMember;
import org.koreait.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.TestPropertySource;

import java.util.ArrayList;
import java.util.List;


import static org.springframework.data.domain.Sort.Order.asc;
import static org.springframework.data.domain.Sort.Order.desc;

@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
public class JPAExam03 {
    @Autowired
    private MemberRepository memberRepository;

    @Test
    void ex01() {
        Member member = new Member();
        member.setUserId("user01");
        member.setUserPw("123456");
        member.setUserNm("사용자01");
        member.setMemberType(MemberType.USER);

        member = memberRepository.save(member); // INSERT
        memberRepository.flush();

         //member = memberRepository.findById(member.getUserNo()).orElse(null);
        //System.out.println(member);

        member.setUserNm("(수정)사용자01"); // UPDATE
        memberRepository.flush();

        member = memberRepository.findById(member.getUserNo()).orElse(null);
        System.out.println(member);

        long count = memberRepository.count();
        System.out.printf("전체 갯수 : %d%n", count); // 1

        //memberRepository.delete(member); // 삭제 처리
        //memberRepository.flush();

        count = memberRepository.count();
        System.out.printf("전체 갯수 : %d%n", count); // 0

        // memberRepository.flush();

        // Member member2 = memberRepository.saveAndFlush(member);
        // System.out.println(member2);
    }

    private void insertMembers() {
        List<Member> members = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Member member = new Member();
            member.setUserId("user" + i);
            member.setUserPw("123456");
            member.setUserNm("사용자" + i);
            member.setMemberType(MemberType.USER);

            members.add(member);
        }

        memberRepository.saveAllAndFlush(members);
    }

    @Test
    void ex02() {
        insertMembers();
        List<Member> members = memberRepository.findAll(); // 전체 조회


        members.stream().forEach(System.out::println);
    }

    @Test
    void ex03() {
        insertMembers();
        //Member member = memberRepository.findByUserId("user1");
        //System.out.println(member);

        //List<Member> members = memberRepository.findByUserNmContaining("용");
        //members.stream().forEach(System.out::println);

        //List<Member> members = memberRepository.findByUserNmContainingOrderByRegDtDesc("용");
        //members.stream().forEach(System.out::println);

        //List<Member> members = memberRepository.getUsers("용");
        //members.stream().forEach(System.out::println);


        //Pageable pageable = PageRequest.of(1,3);
        Pageable pageable = PageRequest.of(0,5, Sort.by(desc("regDt"),asc("userNm")));
        List<Member> members = memberRepository.findByUserNmContaining("용", pageable);

        members.stream().forEach(System.out::println);
    }

    @Test
    void ex04() {
        BooleanBuilder builder = new BooleanBuilder();
        QMember member = QMember.member;
        builder.and(member.userId.contains("ser"))
                .and(member.userNm.contains("용"));

        List<Member> members = (List<Member>)memberRepository.findAll(builder);
        members.stream().forEach(System.out::println);

        // Member mem = memberRepository.findOne(member.userId.eq("user1")).orElse(null);
        // System.out.println(mem);
    }

}
