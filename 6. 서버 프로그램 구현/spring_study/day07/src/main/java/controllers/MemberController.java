package controllers;

import models.member.MemberJoinService;
import models.member.MemberLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("/member")
public class MemberController {
    @Autowired
    private JoinValidator joinValidator;
    @Autowired
    private LoginValidator loginValidator;

    @Autowired
    private Optional<MemberJoinService> opt;

    @Autowired
    private MemberLoginService loginService;


    @GetMapping("/join")
    public String join(@ModelAttribute JoinForm joinForm) {
        /**
         JoinForm joinForm = new JoinForm();
         model.addAttribute("joinForm", joinForm);
         */
        return "member/join";
    }

    @PostMapping("/join")
    public String joinPs(@Valid JoinForm joinForm, Errors errors) { // @Valid : 스프링에게 검증을 위임 (Errors 변수가 반드시 뒤에 와야한다)

        joinValidator.validate(joinForm, errors);

        if (errors.hasErrors()) {
            return "member/join";
        }

        // 회원가입 처리
        MemberJoinService joinService = opt.get();
        joinService.join(joinForm);


        return "redirect:/member/login";
    }

    @GetMapping("/login")
    public String login(@ModelAttribute LoginForm loginForm,
                        @CookieValue(required = false, name="saveId") String sId) { // @CookieValue : 쿠키값을 뒤쪽 변수에 저장한다, required 가 기본적으로 true, false 로 바꿔줘야 쿠키가 없어도 에러가 안뜬다
        System.out.println(sId);
        if (sId != null) {
            loginForm.setUserId(sId);
            loginForm.setSaveId(true);
        }
        return "member/login";
    }

    @PostMapping("/login")
    public String loginPs(@Valid LoginForm loginForm, Errors errors) {

        loginValidator.validate(loginForm, errors);

        if (errors.hasErrors()) {
            return "member/login";
        }

        // 로그인 처리
        loginService.login(loginForm);

        return "redirect:/"; // 메인페이지로 이동
    }
}