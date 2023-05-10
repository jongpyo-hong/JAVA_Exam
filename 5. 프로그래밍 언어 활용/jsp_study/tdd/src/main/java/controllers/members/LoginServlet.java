package controllers.members;

import models.member.LoginService;
import models.member.ServiceManager;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static commons.MessageUtils.*;

@WebServlet("/member/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher rd = req.getRequestDispatcher("/member/login.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            ServiceManager manager = new ServiceManager();
            LoginService service = manager.getLoginService();
            service.login(req);

            /** 아이디 저장 S */
            String saveId = req.getParameter("saveId");
            Cookie cookie = new Cookie("saveId", req.getParameter("userId"));
            if (saveId == null) { // 저장된 쿠키 삭제
                cookie.setMaxAge(0);
            } else { // 쿠키 저장
                cookie.setMaxAge(60 * 60 * 24 * 365);
            }
            resp.addCookie(cookie);
            /** 아이디 저장 E */

            String url = req.getContextPath() + "/index.jsp";
            go(resp, url, "parent");

        } catch (RuntimeException e) {
            alertError(resp, e);
            e.printStackTrace();
        }
    }
}
