package main;

import configs.AppCtx;
import models.emp.EmpDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
        EmpDao empDao = ctx.getBean(EmpDao.class);
        empDao.insert();
        empDao.delete(2);

        ctx.close();
    }
}
