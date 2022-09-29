package com.demo2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/myServlet3")
public class MyServlet3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //解析正文中有正文参数,需要关注编码:
        //情况一: 如果发起post方式请求,传递中文乱码
        //request.setCharacterEncoding("UTF-8");

        //情况二: 如果发起get方式请求,传递中文乱码(如果tomcat8.x以后都自动处理了)
        //       如果乱码: 调整tomcat/cof/server.xml中<host URIEncoding="utf-8">


        //解析请求正文参数:
        String account = request.getParameter("account");
        String password = request.getParameter("password");

        System.out.println("账号:"+account+"--"+"密码:"+password);


    }
}
