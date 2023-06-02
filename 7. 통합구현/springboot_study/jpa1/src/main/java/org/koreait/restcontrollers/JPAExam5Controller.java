package org.koreait.restcontrollers;

import lombok.RequiredArgsConstructor;
import org.koreait.entities.Member;
import org.koreait.repositories.MemberRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jpa/exam5")
@RequiredArgsConstructor
public class JPAExam5Controller {

    private final MemberRepository memberRepository;
    @GetMapping("/ex01")
    public void ex01() {
        Member member = memberRepository.findByUserId("user01");
        memberRepository.delete(member);
        memberRepository.flush();
    }
}
