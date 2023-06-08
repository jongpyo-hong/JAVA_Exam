package org.koreait.configs;

import org.koreait.interceptors.MemberOnlyInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(memberOnlyInterceptor())
                .addPathPatterns("/mypage/**");
    }

    @Bean
    public MemberOnlyInterceptor memberOnlyInterceptor() {
        return new MemberOnlyInterceptor();
    }
}
