<%--
  Created by IntelliJ IDEA.
  User: hyj98
  Date: 2022-09-27
  Time: 13:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录界面</title>
</head>
<body>

    <form action="/servletDemo/loginServlet" method="post">
        <p>
            账号: <input type="text" name="account"/>
        </p>
        <p>
            密码: <input type="password" name="password"/>
        </p>
        <p>
            <input type="submit" value="登录"/>
        </p>
    </form>

</body>
</html>
