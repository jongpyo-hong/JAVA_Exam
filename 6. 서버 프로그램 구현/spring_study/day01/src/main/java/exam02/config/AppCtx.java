package exam02.config;

import exam02.models.member.JoinService;
import exam02.models.member.JoinValidator;
import exam02.models.member.MemberDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration // 설정 클래스 애노테이션
@Import(AppCtx2.class)
public class AppCtx {
    @Bean // 자바객체 애노테이션 - 정의하면 스프링이 객체를 관리해준다
    public MemberDao memberDao() {
        return new MemberDao();
    }

    @Bean
    public JoinValidator joinvalidator() {
        JoinValidator validator = new JoinValidator();
        validator.setMemberDao(memberDao());

        return validator;
    }

    @Bean
    public JoinService joinService() {

        return new JoinService(joinvalidator(), memberDao());
    }

}
