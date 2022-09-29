package com.demo3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

public class TestServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //上下文对象: 1.解析共享使用的全局参数. 2.内部可自定义存储属性,
        //ServletContext servletContext1 = getServletConfig().getServletContext();
        //ServletContext servletContext2 = getServletContext();
        //ServletContext servletContext3 = request.getServletContext();

        ServletContext ctx = getServletContext();

        String pno = ctx.getInitParameter("pno");
        String pname = ctx.getInitParameter("pname");

        ctx.setAttribute("id_card","3024");
        Object id_card = ctx.getAttribute("id_card");
        System.out.println("testServlet2解析内部属性为:"+id_card);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
