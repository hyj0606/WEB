package com.demo4;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/myServlet4_2")
public class MyServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //1.创建cookie
        Cookie cookie = new Cookie("account","mr.laozhang");

        //设置详细信息
        cookie.setMaxAge(600);
        cookie.setDomain("localhost");
        cookie.setPath("/");

        //2.响应
        response.addCookie(cookie);

        response.setContentType("text/html; charset=utf-8");

        PrintWriter writer = response.getWriter();
        writer.write("<h1>欢迎回来！！</h1>");
        writer.flush();
        writer.close();

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
