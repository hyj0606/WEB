<%--
  Created by IntelliJ IDEA.
  User: hyj98
  Date: 2022-09-28
  Time: 16:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

        <%
            //四个域对象
            //request(一次请求过程中),
            //session(一次会话范围内),
            //application(整个应用中),
            //pageContext(当前jsp页面中)
            //page=>request=>session=>application
            request.setAttribute("name","laowang");
            session.setAttribute("name","laozhang");
            application.setAttribute("name","laozhao");
            pageContext.setAttribute("name","laoli");

            //特殊情况: pageContext可控制操作所有域对象中的属性信息
            pageContext.setAttribute("age","88",PageContext.PAGE_SCOPE);//1
            pageContext.setAttribute("age","18",PageContext.APPLICATION_SCOPE);//4
            pageContext.setAttribute("age","28",PageContext.SESSION_SCOPE);//3
            pageContext.setAttribute("age","59",PageContext.REQUEST_SCOPE);//2

            //模拟解析:
            Object name = pageContext.getAttribute("name");
            Object age = pageContext.getAttribute("age");

            Object name1 = session.getAttribute("name");
            Object age1 = session.getAttribute("age");

            out.write("page范围内的属性为: "+name+"---"+age);
            out.write("session范围内的属性为: "+name1+"---"+age1);

            //pageContext能否控制解析其他域对象中的相关数据:
            Object name2 = pageContext.getAttribute("name", PageContext.SESSION_SCOPE);
            Object age2 = pageContext.getAttribute("age", PageContext.SESSION_SCOPE);
            out.write("session范围内的属性为: "+name2+"---"+age2);

            Object name3 = pageContext.getAttribute("name", PageContext.REQUEST_SCOPE);
            Object age3 = pageContext.getAttribute("age", PageContext.REQUEST_SCOPE);
            out.write("request范围内属性为: "+name3+"---"+age3);

        %>

</body>
</html>
