package com.demo3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/myServlet3_2")
public class MyServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("阿俊: 没问题,100块拿去!!!");

        String goods = request.getParameter("goods");
        System.out.println("s1转发到s2中:"+goods);

        //测试: 转发后,请求对象中的自定义属性是否可以正常解析
        Object name = request.getAttribute("name");
        System.out.println("name为:"+name);
    }
}
