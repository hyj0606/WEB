package com.demo3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Date;

@WebServlet("/myServlet3_3")
public class MyServlet3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //解析客户端的请求： request

        //针对客户端做出反馈响应: response

        //2.针对响应数据格式,做出声明
        response.setContentType("text/html; charset=UTF-8");    //方式二
        //response.setHeader("Content-Type", "text/html; charset=UTF-8");  方式一


        //1.针对客户端做出动态网页响应
        Date d1 = new Date();

        String msg = "<h1>合肥今日新闻-发布时间:"+d1+"</h1>";

        //通过输出流，响应内容至浏览器客户端;
        //PrintWriter writer = response.getWriter();
        //ServletOutputStream os = response.getOutputStream();

//        PrintWriter writer = response.getWriter();
//
//        writer.write(msg);
//        writer.flush();
//
//        writer.write(msg);
//        writer.flush();
//
//        writer.close();

        //存储了自定属性到请求对象中
        request.setAttribute("name1","laozhao");

        //3.针对客户端: 提供一个新的资源地址(完整地址)并返回,由客户端发起新的请求
        String path = "/servletDemo/myServlet3_4";
        response.sendRedirect(path);

        //注意事项: 不能多次同时响应(重定向或转发或响应输出).
        //转发:
        //request.getRequestDispatcher("myServlet3_3").forward(request,response);
//        PrintWriter writer = response.getWriter();
//        writer.write("hehe");
//        writer.flush();
//        writer.close();

    }
}
