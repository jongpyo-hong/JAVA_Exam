package controllers;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet { // HttpServlet 을 상속 받으면 Servlet 클래스가 된다

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8"); // ContentType 을 알려줘야 인식한다
        //resp.setCharacterEncoding("UTF-8"); // 문자단위를 3바이트로 해야 한글을 인식한다
        PrintWriter out = resp.getWriter();
        out.println("<h1>안녕하세요</h1>");
    }
}
