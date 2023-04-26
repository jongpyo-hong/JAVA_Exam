package controllers;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet("/life")
public class LifeCycleServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        String key1 = config.getInitParameter("key1");
        String key2 = config.getInitParameter("key2");

        System.out.printf("key1=%s, key2=%s%n", key1, key2);

    }

    /**
    @Override
    public void init() throws ServletException { // 최초 한번 실행
        System.out.println("init");
    }*/



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet");
    }

    @Override
    public void destroy() { // 최후 한번 실행, 자원해제
        System.out.println("destroy");
    }
}
