package configs;

import controllers.HelloController;
import controllers.members.JoinController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("controllers")
public class ControllerConfig {
    /**
    @Bean
    public HelloController helloController() {
        return new HelloController();
    }

    @Bean
    public JoinController joinController() {
        return new JoinController();
    }*/
}
