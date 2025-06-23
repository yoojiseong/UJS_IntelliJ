package com.example.hello_project.todo.controller;

import com.example.hello_project.todo.dto.TodoDto;
import com.example.hello_project.todo.service.TodoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "todoReadController", urlPatterns = "/todo/read")
public class TodoReadController extends HttpServlet {
    //화면 제공 목적, 데이터를 담은 결과 화면
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("TodoReadController : 하나 조회 ");
        // 임의의 todo 번호, 100
        // 더미 데이터 가져오기, 현재는 메모리 작업 db아님
        // /todo/read?tno=100, 쿼리 스트링형식으로, 파라미터로 전달
        // 문자열을 받아와서 타입 변환 롱타입으로
        Long tno = Long.parseLong(req.getParameter("tno"));
        // Todo
        TodoDto dto = TodoService.INSTANCE.getTodoByTno(tno);
        //화면에 데이터 탑재
        req.setAttribute("dto", dto);
        req.getRequestDispatcher("/WEB-INF/todo/todoRead.jsp").forward(req,resp);

    }
}
