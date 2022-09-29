package com.demo3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/myServlet3_1")
public class MyServlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("老赵：no money......");

        //测试: 客户端请求参数是否可以解析
        String goods = request.getParameter("goods");
        System.out.println("客户端传递了商品到s1中"+goods);

        //测试: 当前服务器资源,自定义属性信息存储.
        request.setAttribute("name","mr.laozhao");

        Object name = request.getAttribute("name");
        System.out.println(name);

        //转发: 转向下一个资源(借助request请求对象完成).
        //需要提供转发地址(项目内部跳转行为,地址从项目内搜索即可): /myServlet3_2
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/myServlet3_2");
        //开始转发: 传递请求和响应到下一个资源中
        requestDispatcher.forward(request,response);

    }
}
