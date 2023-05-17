package controllers.members;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import models.member.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/member")
public class MemberController {
    @GetMapping("/info")
    public String info(Model model) {
        Member member = new Member();
        member.setUserId("<h2>user01</h2>");
        member.setUserPw("123456");
        member.setUserNm("사용자01");
        member.setRegDt(LocalDateTime.now());

        model.addAttribute("member", member);

        return "member/info";
    }

    @GetMapping("/list")
    public String members(Model model) {
        List<Member> members = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            Member member = new Member();
            member.setUserId("user" + i);
            member.setUserNm("사용자" + i);
            member.setRegDt(LocalDateTime.now());
            members.add(member);
        }

        model.addAttribute("members", members);
        return "member/list";
    }
}
