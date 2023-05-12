package exam03;

import exam03.Message;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        Message m1 = ctx.getBean(Message.class);
        Message m2 = ctx.getBean(Message.class);
        System.out.println(m1 == m2);

        ctx.close();
    }
}
