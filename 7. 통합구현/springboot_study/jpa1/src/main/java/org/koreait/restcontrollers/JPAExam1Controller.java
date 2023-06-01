package org.koreait.restcontrollers;

import lombok.extern.java.Log;
import org.koreait.constants.MemberType;
import org.koreait.entities.BoardData;
import org.koreait.entities.Member;
import org.koreait.repositories.BoardDataRepository;
import org.koreait.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Log
@RestController
@RequestMapping("/jpa/exam1")
public class JPAExam1Controller {
    @Autowired
    private MemberRepository memberRepository;
    @Autowired
    private BoardDataRepository boardDataRepository;

    @GetMapping("/ex01")
    public void ex01() {
        insertData();
    }

    private void insertData() {
        Member member = new Member();
        member.setUserId("user01");
        member.setUserPw("123456");
        member.setUserNm("사용자01");
        member.setMemberType(MemberType.USER);

        member = memberRepository.saveAndFlush(member);

        List<BoardData> items = new ArrayList<>();
        for (int i=1; i<=10; i++) {
            BoardData item = new BoardData();
            item.setSubject("제목" + i);
            item.setContent("내용" + i);
            item.setPoster("작성자" + i);
            item.setMember(member);
            items.add(item);
        }

        boardDataRepository.saveAllAndFlush(items);
    }

    @GetMapping("/ex02")
    public void ex02() {
        BoardData boardData = boardDataRepository.findById(1L).orElse(null);
        // log.info(boardData.toString());
        Member member = boardData.getMember();
        log.info(member.toString());
    }

    @GetMapping("/ex03")
    public void ex03() {
        Member member = memberRepository.findByUserId("user01");
//        List<BoardData> boardData = member.getBoardDatas(); // 회원이 작성한 게시글 조회
//        boardData.stream().forEach(System.out::println);
    }
}
