package config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

@Order(2)
@Aspect
public class ProxyCalculator {

    /**
    @Pointcut("execution(* exam05..*(..))") // 프록시(공통 기능이 적용될) 범위
    //@Pointcut("execution(long exam05..*(*))")
    public void publicTarget() {}
     */

    @Around("CommonPointcut.publicTarget()")
    //@Around("publicTarget()")
    //@Around("execution(* exam05..*(..))") // 프록시 범위가 하나만 있을 경우 @Around 에 명시 가능
    public Object process(ProceedingJoinPoint joinPoint) throws Throwable {
        long stime = System.nanoTime();
        try {
            Object result = joinPoint.proceed(); // 각각의 객체 안의 factorial(핵심 기능) 호출

            return result;
        } finally {
            long etime = System.nanoTime();
            System.out.printf("걸린시간 : %d%n", etime - stime);
        }
    }
}
