package com.demo4;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/myServlet4_3")
public class MyServlet3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //如果客户端请求成功: 进入处理,将维护一个新连接,并创建会话对象

        //直接获取会话对象
        //直接返回(可能为空): HttpSession session = request.getSession();
        //直接返回(为空创建): HttpSession session = request.getSession(true);
        HttpSession session = request.getSession();
        System.out.println("解析建立的会话对象: "+ session);

        //借助会话对象记录数据
        session.setAttribute("name1","mr.laowang");
        session.setAttribute("money",100);

        //设置会话对象
        session.setMaxInactiveInterval(60); //设置有效时间

        //session.setMaxInactiveInterval(-1); //立即失效

        //session.invalidate(); 清空会话对象

        Object name1 = session.getAttribute("name1");
        System.out.println(name1);

        //session.removeAttribute("name1");


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
