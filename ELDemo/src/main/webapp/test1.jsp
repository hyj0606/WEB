<%@ page import="com.demo1.Student" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<%--
  Created by IntelliJ IDEA.
  User: hyj98
  Date: 2022-09-29
  Time: 9:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%
        //模拟存储数据
        pageContext.setAttribute("no","001");

        Student stu1 = new Student(2, "wang", "123123");
        request.setAttribute("stu1",stu1);

        List list = new ArrayList();
        list.add("小花");
        list.add("小丽");
        session.setAttribute("list",list);

        //问题: map中的key:支持任意存储类型,但是解析只支持Long和String类型
        Map map = new HashMap();
        map.put("a","王二");
        map.put("2","张三");
        application.setAttribute("map",map);

    %>

<%--el表达式解析相关数据--%>
    <h1>
        ${no}
    </h1>
    <h1>
        ${stu1.sid }---${stu1.sname }
    </h1>
    <h1>
        ${list[0]}---${list[1]}
    </h1>
    <h1>
        ${map["a"]}---${map["2"]}
    </h1>

    <%--API对象也可解析自身属性: --%>
    <h1>
        ${pageContext.request}
        ${pageContext.session}
        ${pageContext.servletContext}

        ${pageContext.request.contextPath} <%--动态解析地址方式--%>
        ${pageContext.request.method}
    </h1>
    <%--    <a href="${pageContext.request.contextPath}/test2.jsp">跳转</a>--%>

</body>
</html>
