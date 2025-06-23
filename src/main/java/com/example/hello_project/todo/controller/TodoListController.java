package com.example.hello_project.todo.controller;

import com.example.hello_project.todo.dto.TodoDto;
import com.example.hello_project.todo.service.TodoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "todoListController" , urlPatterns = "/todo/list")
public class TodoListController extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("todoListController.doGet 호출, 목록 화면제공. ");

        // 작업1,
        // 서비스에게, 데이터좀 가져다 줄래? 요청.
        List<TodoDto> dtoList = TodoService.INSTANCE.getList();

        // 작업2,
        // 화면에, 데이터를 첨부하기.
        req.setAttribute("list", dtoList);

        // 빌드 패턴으로 해당 객체에서, 사용하는 메서드를 연속적으로 사용하는 디자인 패턴형식
        req.getRequestDispatcher("/WEB-INF/todo/todoList.jsp").forward(req, resp);
        // 아직 화면은 미구현.
    }
}
