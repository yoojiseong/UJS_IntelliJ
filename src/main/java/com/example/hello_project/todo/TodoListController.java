package com.example.hello_project.todo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "todoListController", urlPatterns="/todo/list")
public class TodoListController extends HttpServlet {
    // 리스트 목록 화면 제공
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException{
        System.out.println("TodoListController.doGet 호출, 목록 화면 제공. ");
        // get방식으로 WEB-INF안에 있는 todo_list를 화면에 띄움
        req.getRequestDispatcher("/WEB-INF/todo/todoList.jsp").forward(req, resp);
    }
}
