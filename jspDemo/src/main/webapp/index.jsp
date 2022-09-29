<%--三大指令 1.page --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="test1.jsp" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>

<%--引入第三方依赖库--%>
<%--<%@taglib prefix="" uri="" %>--%>



<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<%--引入指定文件 : 称为静态引入:直接引入源文件--%>
<%--<%@include file="common.jsp"%>--%>

<%--动态引入: jsp标签实现common.jsp-编译执行后进行引用. --%>
<%--<jsp:include page="common.jsp"></jsp:include>--%>

    <h1>哈哈</h1>

<%--    jsp注释--%>
    <%--局部脚本: 代码将生成在类中service()方法中--%>
    <%
        int a = 10/0;
        String name = "mr.zhao";
        for (int i = 0; i < 10; i++) {
            //输出内容至浏览器
            out.write("<h1>java代码输出: 好好学习,天天向上!!!</h1>");
    %>
        <h1>html代码输出: 好好学习,天天向上</h1>
    <%
        }
        //模拟调用全局成员
         int result = test1();
        out.write("模拟调用全局方法，结果输出为: " + result);

    %>
    </br>
    <%--全局脚本: 代码将生成在类中成为全局成员--%>
    <%!
        //属性
        int a = 10;

        public int test1() {
            return a;
        }
    %>

    <%-- <%= %> 相等于out.write()--%>
    <%="<a href='#'> 好好玩!!!</a>"%></br>
    <%=result %>

    <%
        //局部脚本
        List list = new ArrayList();
    %>

</body>
</html>