package com.demo4;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/logoutServlet")
public class LogoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //退出会话

        //1.清空会话中存储信息
        HttpSession session = request.getSession();
        //清空会话
        session.invalidate();

        //2.返回登录首页(使用重定向)
        response.sendRedirect("/servletDemo/login.jsp");


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
