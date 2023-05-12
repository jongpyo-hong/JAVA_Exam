package main;

import config.*;
import exam05.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        Calculator cal = ctx.getBean(Calculator.class);


        long result = cal.factorial(20);
        System.out.println(result);

        result = cal.factorial(20);
        System.out.println(result);

        result = cal.factorial(20);
        System.out.println(result);

        result = cal.factorial(20);
        System.out.println(result);

        ctx.close();
    }
}
