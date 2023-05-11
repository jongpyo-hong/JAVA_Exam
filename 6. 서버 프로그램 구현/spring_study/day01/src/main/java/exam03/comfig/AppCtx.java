package exam03.comfig;

import exam03.models.member.JoinService;
import exam03.models.member.JoinValidator;
import exam03.models.member.MemberDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import exam03.models.member.*;

import java.time.format.DateTimeFormatter;

@Configuration
public class AppCtx {
    @Bean
    //@Qualifier("mdao1") // 같은 기능을 가진 객체가 있을경우 @Qualifier 를 명시하면 명시한 객체를 사용한다
    public MemberDao memberDao() {


        return new MemberDao();
    }
    /*
    @Bean
    public MemberDao memberDao2() {


        return new MemberDao();
    }*/

    @Bean
    public JoinService joinService() {
        return new JoinService();
    }

    @Bean
    public JoinValidator joinValidator() {
        return new JoinValidator(memberDao());
    }

    @Bean
    public MemberInfoService infoService() {
        return new MemberInfoService();
    }

    //@Bean
    public DateTimeFormatter dateTimeFormatter() {
        return DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm");
    }
}
