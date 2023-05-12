package exam02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        Message message = ctx.getBean(Message.class);
        message.send("안녕하세요");


        ctx.close();
    }
}
