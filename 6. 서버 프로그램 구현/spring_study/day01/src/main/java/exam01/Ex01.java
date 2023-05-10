package exam01;

import exam01.config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
        Hello hello = ctx.getBean("hello", Hello.class);
        hello.message();

        Hello hello2 = ctx.getBean("hello", Hello.class);
        hello2.message();

        System.out.println(hello == hello2);

        ctx.close();
    }
}
