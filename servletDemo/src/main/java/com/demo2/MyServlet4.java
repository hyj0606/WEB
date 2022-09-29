package com.demo2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/myServlet4")
public class MyServlet4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //请求对象生命周期:
        //      1.产生: 客户端浏览器发起请求时,服务器端产生
        //          客户端每次请求都会产生一个独立的全新请求对象.
        //      2.在服务端处理过程中一直保持使用,直至处理完成后
        //      3.销毁: 在本次请求处理完成后,做出响应成功后则请求对象结束.

        //request对象: 自定义存储属性.
        request.setAttribute("name","老王");
        request.setAttribute("age",20);

        Object name = request.getAttribute("name");
        Object age = request.getAttribute("age");
        System.out.println(name+"--"+age);

        request.removeAttribute("age");
        Object name2 = request.getAttribute("name");
        Object age2 = request.getAttribute("age");
        System.out.println(name2+"--"+age2);

    }
}
