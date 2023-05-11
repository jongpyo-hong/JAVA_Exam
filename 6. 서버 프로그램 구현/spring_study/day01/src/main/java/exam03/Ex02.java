package exam03;

import exam03.comfig.*;
import exam03.models.member.JoinService;
import exam03.models.member.Member;
import exam03.models.member.MemberInfoService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;

public class Ex02 {
    public static void main(String[] args){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx2.class);

        JoinService joinService = ctx.getBean(JoinService.class); // 스프링은 싱글톤 패턴으로 객체를 관리한다
        MemberInfoService infoService = ctx.getBean(MemberInfoService.class);

        Member member = new Member();
        member.setUserId("user01");
        member.setUserPw("12345678");
        member.setUserPwRe("12345678");
        member.setUserNm("사용자01");
        member.setRegDt(LocalDateTime.now());
        joinService.join(member);

        infoService.print(member.getUserId());

        ctx.close();
    }
}
