package com.example.hello_project.todo.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "todoRegController" , urlPatterns = "/todo/register")
public class TodoRegController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("TodoListController.doGet 호출, 입력 화면 제공. ");
        // get방식으로 WEB-INF안에 있는 todo_list를 화면에 띄움
        req.getRequestDispatcher("/WEB-INF/todo/todoReg.jsp").forward(req, resp);
    }
    //등록 로직 처리
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("TodoListController.doPost 호출, 로직 처리 ");

        // todo/list로 post형식으로 보내기
        resp.sendRedirect("/todo/list");
    }

}
