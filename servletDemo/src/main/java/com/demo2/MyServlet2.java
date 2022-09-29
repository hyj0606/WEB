package com.demo2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

@WebServlet("/myServlet2")
public class MyServlet2 extends HttpServlet {

    //request : tomcat服务容器识别到客户端请求后,创建,并封装请求参数,传递给当前servlet
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //当客户端请求至服务端时: 借助HttpServletRequest请求对象类型完成的

        //1.request : 解析当前请求头参数
        Enumeration<String> names = request.getHeaderNames();
        //充当迭代器使用
        while (names.hasMoreElements()){
            String name = names.nextElement();
            //根据请求头参数名-解析对应的参数值:
            String header = request.getHeader(name);

            System.out.println("请求头包含: "+name+"----"+header);
        }

        //2.request: 解析请求正文参数
        String account = request.getParameter("account");
        String password = request.getParameter("password");
        System.out.println("account:"+account+"---"+"password"+password);
        String[] values = request.getParameterValues("subject");
        System.out.println("课程长度:"+values.length);

        //3.request: 其他解析请求数据的方法
        StringBuffer url = request.getRequestURL(); //解析请求的完整地址
        String uri = request.getRequestURI();       //解析请求的资源地址
        System.out.println(uri);
        System.out.println(url);

        String method = request.getMethod();    //请求方法
        System.out.println(method);

        String contextPath = request.getContextPath();  //解析请求的项目根目录地址
        System.out.println(contextPath);

        Cookie[] cookies = request.getCookies();    //解析客户端传递过来的cookies
        System.out.println(cookies);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}





