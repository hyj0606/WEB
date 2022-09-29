<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Date" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

        <%
            //模拟提供集合
            List names = new ArrayList();
            names.add("小花1");
            names.add("小花2");
            names.add("小花3");
            names.add("小花4");
            request.setAttribute("names",names);

            request.setAttribute("money",100);

            request.setAttribute("borndate",new Date());

        %>

        <%--jstl标签--%>
        <ul>
            <c:forEach var="name" items="${names}" begin="0" end="5">
                <h1>${name}</h1>
            </c:forEach>
        </ul>

        <c:choose>
            <c:when test="${money >= 100}">
                <h1>购买电脑成功</h1>
            </c:when>
            <c:when test="${money>=80 && money<100}">
                <h1>购买手机</h1>
            </c:when>
            <c:otherwise>
                <h1>购买失败</h1>
            </c:otherwise>
        </c:choose>

        <c:if test="${money < 60}">
            <h1>余额不足,请充值!!!</h1>
        </c:if>

        <c:set var="name" value="mr.laowang" scope="request"></c:set>
        <h1>${requestScope.name}</h1>

        <h1>日期: ${borndate}</h1>
        <fmt:formatDate var="borndate2" scope="request" value="${borndate}" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate>
        <h1>格式化后的日期: ${borndate2}</h1>

        <fmt:parseDate var="borndate3" scope="request" value="${borndate2}" pattern="yyyy-MM-dd HH:mm:ss"></fmt:parseDate>
        <h1>解析后的日期对象为: ${borndate3}</h1>

</body>
</html>
