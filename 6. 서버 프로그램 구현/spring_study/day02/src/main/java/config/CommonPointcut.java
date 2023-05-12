package config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CommonPointcut {
    @Pointcut("execution(* exam05..*(..))") // 프록시(공통 기능이 적용될) 범위
    public void publicTarget() {}
}
