package config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

import java.util.HashMap;
import java.util.Map;

@Order(1)
@Aspect
public class CachedProxy {

    private Map<Long, Object> cache = new HashMap<>();

/**
    @Pointcut("execution(* exam05..*(..))")
    public void publicTarget() {}
    */
    @Around("CommonPointcut.publicTarget()")
    public Object process(ProceedingJoinPoint joinPoint) throws Throwable {

        Object[] args = joinPoint.getArgs();
        Long num = (Long)args[0];
        // 캐시 조회
        if (cache.containsKey(num)) {
            System.out.printf("[%d]캐시 사용됨%n", num);
            return cache.get(num);
        }

        Object result = joinPoint.proceed();

        // 캐시 저장
        cache.put(num, result);
        System.out.printf("[%d]캐시 저장됨%n", num);

        return result;
    }
}
