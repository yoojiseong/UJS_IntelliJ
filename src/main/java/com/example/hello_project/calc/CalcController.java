package com.example.hello_project.calc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "calcController", urlPatterns = "/calc/makeResult")
public class CalcController extends HttpServlet {
    // post 처리반, 로직처리 하기
    // 사용자로부터 전달 받은 숫자 2개를 출력해보기
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException{
        // 웹, 파라미터로 전달 되는 모든 타입은 문자열이여서 String에 담기
        //req 에 웹에서 받아온 숫자가 들어있음
        String num1 = req.getParameter("num1");
        String num2 = req.getParameter("num2");

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        //콘솔 출력이고 화면 제공 없음.

        //리다이렉트 기능을 통해 특정 화면으로 안내
        //1) 화면에 직접 안내x 2) 서블릿을 통해서 화면을 안내함
        resp.sendRedirect("/index");

    }
}
