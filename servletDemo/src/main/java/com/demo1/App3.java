package com.demo1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName App3
 * @Description 考虑动态网页的传输基于http协议,针对处理
 * @Author hyj98
 * @Date 2022-09-21 12:02
 * @Version 1.0
 */

@WebServlet("/a3")
public class App3 extends HttpServlet {

    //HttpServlet: service()中编写默认实现
    /*
    * 1.识别了客户端基于http协议的请求方式: get/post.....
    * 2.根据get请求方式:给予doGet()处理
    *   根据post请求方式:给予doPost()处理
    *   ......
    *
    * */

    //自定义处理办法:
    // 1.不能重写service方法.否则会影响针对不同请求的不同处理
    // 2.重写doGet()/doPost()....


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("识别到了客户端的请求...它是一种get请求方式...正在处理");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("识别到了客户端的请求...它是一种post请求方式...正在处理");
    }
}
