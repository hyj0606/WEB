package com.demo4;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/myServlet4_4")
public class MyServlet4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //识别会话对象
        HttpSession session = request.getSession();
        System.out.println("解析建立的会话对象: "+session);

        //识别myServlet4_3中缓存的信息
        Object name1 = session.getAttribute("name1");
        Object money = session.getAttribute("money");
        System.out.println(name1+"----"+money);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
