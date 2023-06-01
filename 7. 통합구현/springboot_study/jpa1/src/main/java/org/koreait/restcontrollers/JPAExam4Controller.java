package org.koreait.restcontrollers;

import lombok.RequiredArgsConstructor;
import org.koreait.constants.MemberType;
import org.koreait.entities.Member;
import org.koreait.repositories.MemberRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jpa/exam4")
@RequiredArgsConstructor
public class JPAExam4Controller {
    private final MemberRepository memberRepository;

    @GetMapping("/ex01")
    public void ex01() {
        Member member = Member.builder()
                .userId("user02")
                .userNm("사용자02")
                .userPw("123456")
                .memberType(MemberType.USER)
                .build();

        memberRepository.saveAndFlush(member);
    }
}
