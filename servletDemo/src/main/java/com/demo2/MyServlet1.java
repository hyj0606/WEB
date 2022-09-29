package com.demo2;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName MyServlet1
 * @Description TODO
 * @Author hyj98
 * @Date 2022-09-22 9:12
 * @Version 1.0
 */

@WebServlet("/myServlet1")
public class MyServlet1 extends HttpServlet {

    //备注: 单例特性
    //优点: 不会产生大量的实例在内存中,节省内存空间
    //缺点: 如果出现像以下写法全局变量

    //构造方法
    public MyServlet1(){
        System.out.println("servlet对象创建实力例化完成");
    }

    //当前servlet想要初始化: init()
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("模拟servlet初始化....");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("识别了客户端的get的请求....模拟处理");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("识别了客户端的post的请求....模拟处理");
    }

    //销毁任务: servlet在当被销毁前完成处理任务
    @Override
    public void destroy() {
        System.out.println("servlet准备销毁");
    }
}
