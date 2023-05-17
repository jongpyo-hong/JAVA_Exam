package controllers.members;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/member/join")
public class JoinController {

    @Autowired
    private HttpSession session;
    @GetMapping // /member/join
    public String join(Model model) {

        model.addAttribute("joinForm", new JoinForm());

        return "member/join";
    }

    /**
    @PostMapping // /member/join
    public String joinPs(JoinForm joinForm, Model model, HttpServletRequest request) {

        String requestURI = request.getRequestURI();
        System.out.println(requestURI);
        System.out.println(session);
        // model.addAttribute("joinForm", joinForm);

        return "member/join";
    }*/

    @PostMapping
    public String joinPs(JoinForm joinForm) {

        System.out.println(joinForm);
        // 커맨드 객체 -> EL식 변수 추가 joinForm

        return "member/join";
    }
}