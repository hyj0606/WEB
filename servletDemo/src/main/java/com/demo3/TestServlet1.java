package com.demo3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

//@WebServlet(urlPatterns = "/testServlet1", initParams = {
//        @WebInitParam(name = "no",value = "110"),
//        @WebInitParam(name = "personName",value = "mr.laowang")
//})
//注解配置初始化参数--课代替为web.xml配置形式:
public class TestServlet1 extends HttpServlet {

    //servlet初始化时.执行的任务:
    @Override
    public void init(ServletConfig config) throws ServletException {
        //拿到了servlet的初始化配置对象
        //super.init(config); 官方提供的父类,默认保留了这个配置对象,方便后期使用
        super.init(config);

        //简单目前模拟使用:
        String age = config.getInitParameter("age");
        String address = config.getInitParameter("address");
        System.out.println("模拟初始化使用信息:"+age+"---"+address);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //如何使用初始化参数: 一般在初始化任务执行时.

        //是否继续使用servletConfig对象
        ServletConfig config = getServletConfig();
        System.out.println("继续使用config对象:"+config);

        //可以根据config对象进行上下文对象使用: servletConfig其实就是所有servlet的一个共享对象
        ServletContext servletContext = config.getServletContext();
        System.out.println("继续使用config对象--解析当前servlet上下文" + servletContext);

        //接着TestServlet2的练习演示: 上下文解析
        Object id_card = servletContext.getAttribute("id_card");
        System.out.println("TestServlet1解析内部属性为: "+id_card);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
