package exam02;

import exam02.config.AppCtx;
import exam02.config.AppCtx2;
import exam02.models.member.*;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    public static void main(String[] args) {
        //AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class, AppCtx2.class);
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        JoinService joinService = ctx.getBean("joinService", JoinService.class);
        MemberDao memberDao = ctx.getBean("memberDao", MemberDao.class);

        Member member = new Member();
        member.setUserId("user01");
        member.setUserPw("12345678");
        member.setUserPwRe("12345678");
        member.setUserNm("사용자01");
        joinService.join(member);

        Member joinedMember = memberDao.get(member.getUserId());
        System.out.println(joinedMember);

        LoginService loginService = ctx.getBean("loginService", LoginService.class);
        System.out.println(loginService);
        ctx.close();

    }
}
