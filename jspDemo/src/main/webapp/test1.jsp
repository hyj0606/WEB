<%--
  Created by IntelliJ IDEA.
  User: hyj98
  Date: 2022-09-28
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%--
        jsp使用九大内置对象
        request , response , session , config , application

        out(表示当前页面的响应输出流),
        page(表示当前jsp文件对象),
        pageContext(表示当前jsp中维护的共享上下文对象),
        exception(表示在异常处理页面中充当捕获到的异常对象).

    --%>

    <%
        pageContext.setAttribute("no","109");
        request.setAttribute("no","111");
        session.setAttribute("no","112");
        application.setAttribute("no","113");

        Object no = pageContext.getAttribute("no");
        Object no1 = request.getAttribute("no");
        Object no2 = session.getAttribute("no");
        Object no3 = application.getAttribute("no");

        out.write("数据为: "+no+"----"+no1+"---"+no2+"---"+no3);

//        response.sendRedirect("/jspDemo/test2.jsp");
    %>

</body>
</html>
