package exam01.config;

import exam01.Hello;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx {
    @Bean
    public Hello hello() {
        return new Hello();
    }
}
