package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cal") // xml 파일에 직접 입력하지 않아도 url 을 생성할 수 있다
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // /cal?num1=100&num2=200

        int num1 = Integer.parseInt(req.getParameter("num1")); // getParameter()는 반환값이 String 이라서 Integer.parseInt 로 형변환 해야한다
        int num2 = Integer.parseInt(req.getParameter("num2"));

        int result = num1 + num2;
        System.out.printf("%d + %d = %d%n",num1, num2, result);
    }
}
