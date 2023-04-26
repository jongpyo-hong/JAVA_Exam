package controllers;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;

public class BoardServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.print("<form method='post' action='board'>");
        out.print("제목 : <input type='text' name='subject'><br>");
        out.print("내용 : <textarea name='content'></textarea><br>");
        out.print("<button type='submit'>작성하기</button>");
        out.print("</form>");
        System.out.println("doGet() - Board");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //req.setCharacterEncoding("UTF-8"); // req 에도 UTF-8을 입력해줘야 한글을 인식한다 , filter 에서 미리하면 정의하지 않아도 된다
        String subject = req.getParameter("subject"); // resp 의 subject
        String content = req.getParameter("content"); // resp 의 content

        System.out.printf("제목 : %s, 내용 : %s%n", subject, content);
    }
}
