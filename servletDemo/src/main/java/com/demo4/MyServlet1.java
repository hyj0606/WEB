package com.demo4;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/myServlet4_1")
public class MyServlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //测试: 客户端是否传递cookie参数
        Cookie[] cookies = request.getCookies();
        System.out.println("客户端传递了几个cookie值："+cookies.length);

        for (Cookie c1 : cookies) {
            System.out.println("得到的cookie值："+c1.getName()+"------"+c1.getValue());
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
