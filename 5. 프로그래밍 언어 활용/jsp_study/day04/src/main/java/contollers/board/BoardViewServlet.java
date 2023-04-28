package contollers.board;

import models.board.BoardData;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/board/view")
public class BoardViewServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BoardData data = new BoardData();
        data.setId(1l);
        data.setSubject("게시글 제목");
        data.setContent("게시글 내용");
        data.setPoster("글쓴이");

        req.setAttribute("data", data);

        RequestDispatcher rd = req.getRequestDispatcher("/board/view.jsp");
        rd.forward(req, resp);
    }
}
