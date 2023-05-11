package exam03;

import exam03.models.member.JoinValidator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import exam03.comfig.*;
import exam03.models.member.*;

import java.time.LocalDateTime;

public class Ex01 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        // JoinService joinService = ctx.getBean("joinService", JoinService.class);
        JoinService joinService = ctx.getBean(JoinService.class); // 스프링은 싱글톤 패턴으로 객체를 관리한다

        Member member = new Member();
        member.setUserId("user01");
        member.setUserPw("12345678");
        member.setUserPwRe("12345678");
        member.setUserNm("사용자01");
        member.setRegDt(LocalDateTime.now());
        joinService.join(member);

        MemberInfoService infoService = ctx.getBean("infoService", MemberInfoService.class);
        infoService.print(member.getUserId());

        ctx.close();
    }
}
