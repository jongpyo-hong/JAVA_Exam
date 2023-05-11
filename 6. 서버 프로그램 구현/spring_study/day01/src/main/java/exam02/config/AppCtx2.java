package exam02.config;

import exam02.models.member.LoginService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx2 {
    @Bean
    public LoginService loginService() {
        return new LoginService();
    }


}
