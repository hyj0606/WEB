package com.demo1;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * @ClassName App2
 * @Description 客户端请求App2这个Servlet动态网页
 * @Author hyj98
 * @Date 2022-09-21 11:55
 * @Version 1.0
 */

public class App2 extends GenericServlet {

    //提供核心处理方法即可:
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("模拟客户端请求别识别,正在处理...");
    }
}







