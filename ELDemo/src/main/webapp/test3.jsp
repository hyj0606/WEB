<%--
  Created by IntelliJ IDEA.
  User: hyj98
  Date: 2022-09-29
  Time: 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

        <h1>${fn:trim("123")}</h1>
        <h1>${fn:length("110@qq.com")}</h1>
        <h1>${fn:substring("110@qq.com",0,3)}</h1>
        <h1>${fn:toUpperCase("110@qq.com")}</h1><%--转为大写--%>

</body>
</html>
