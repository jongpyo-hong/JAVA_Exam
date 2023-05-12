package exam03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppCtx {
    @Bean
    @Scope("prototype")
     public Message message() {
         return new Message();
     }
}
