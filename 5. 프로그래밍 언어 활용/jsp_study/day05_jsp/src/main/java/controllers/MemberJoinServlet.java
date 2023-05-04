package controllers;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet("/member/join")
public class MemberJoinServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String[] addCss = { "member/join", "member/calendar" };
        List<String> addScript = Arrays.asList("member/join", "file/upload");

        req.setAttribute("addCss",addCss);
        req.setAttribute("addScript", addScript);

        RequestDispatcher rd = req.getRequestDispatcher("/member/join.jsp");
        rd.forward(req, resp);
    }
}
