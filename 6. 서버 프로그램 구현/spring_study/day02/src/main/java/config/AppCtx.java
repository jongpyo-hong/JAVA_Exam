package config;

import exam05.Calculator;
import exam05.RecCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
//@EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableAspectJAutoProxy
public class AppCtx {

    @Bean
    public CachedProxy cachedProxy() {
        return new CachedProxy();
    }


    @Bean
    public ProxyCalculator proxyCalculator() {
        return new ProxyCalculator();
    }

    @Bean
    public RecCalculator calculator() {
        return new RecCalculator();
    }
}
