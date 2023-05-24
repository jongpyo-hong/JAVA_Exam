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
    public String joinPs(@Valid JoinForm joinForm, Errors errors) {
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
                        @CookieValue(required=false, name="saveId") String sId) {
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

        return "redirect:/"; // 메인페이지
    }
<<<<<<< HEAD

=======
>>>>>>> 61fd14af1414e60d0cd581d87688cf376330dbbb
    @GetMapping("/list")
    public String members(@ModelAttribute @Valid SearchForm searchForm, Errors errors) {

        return "member/list";
    }

<<<<<<< HEAD
    @GetMapping("/info/{id}")
    public String info(@PathVariable(required=false, name="id") String userId) {
        System.out.println(userId);

        boolean result = true;
        if (result) {
            throw new RuntimeException("예외 발생 합니다...");
=======
    @GetMapping("/info/{id}") // {...} : 중괄호 안쪽에 입력하면 경로 변수가 된다
    public String info(@PathVariable(required = false, name = "id") String userId) {
        // 경로변수를 사용하려면 매개변수가 경로변수와 같아야한다
        // 경로변수가 매개변수와 다르다면 @PathVariable(name="경로변수") name 에 경로변수값을 넣으면 된다

        System.out.println(userId);
        boolean result = true;
        if (result) {
            throw new RuntimeException("예외 발생 입니다");
>>>>>>> 61fd14af1414e60d0cd581d87688cf376330dbbb
        }

        return "member/info";
    }


}