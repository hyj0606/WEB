package com.demo4;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //1.解析客户端请求的账号和密码参数
        String account = request.getParameter("account");
        String password = request.getParameter("password");

        //2.验证账号密码的正确性
        String account2 = "sunsi";
        String password2 = "99";

        if (account.equals(account2) && password.equals(password2)){
            //3.登录成功,身份储存到会话中
            HttpSession session = request.getSession();
            session.setAttribute("account",account);

            //重定向: 跳转到首页
            response.sendRedirect("/servletDemo/index.jsp");

        }else {

            //验证失败: 跳回到登录首页
            response.sendRedirect("/servletDemo/login.jsp");


        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
