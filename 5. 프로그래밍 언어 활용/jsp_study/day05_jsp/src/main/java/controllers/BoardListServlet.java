package controllers;

import models.board.Board;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/board/list")
public class BoardListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Board> items = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            Board board = new Board(i, "제목" + i, "작성자" + i);
            items.add(board);
        }

        req.setAttribute("items", items);

        RequestDispatcher rd = req.getRequestDispatcher("/jstl/Ex07.jsp");
        rd.forward(req, resp);
    }
}
