package com.demo1;

import javax.servlet.*;
import java.io.IOException;

/**
 * @ClassName App1
 * @Description 开发一个动态网页：
 *              1.实现Servlet接口
 *              2.将当前程序对外映射访问路径（web3.x以上全部注解。以下建议采用web.xml配置）
 *
 * @Author hyj98
 * @Date 2022-09-21 11:44
 * @Version 1.0
 */

public class App1 implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    //将识别客户端请求,并提供服务处理
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("识别了客户端请求...模拟处理");

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
