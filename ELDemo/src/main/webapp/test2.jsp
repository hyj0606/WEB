<%--
  Created by IntelliJ IDEA.
  User: hyj98
  Date: 2022-09-29
  Time: 9:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%
        //字符串,数值:
        int a = 100;
        String email = "110@qq.com";

        //模拟存储
        request.setAttribute("a",a);
        request.setAttribute("email",email);

    %>

    <h1>${a+10-10*10/10}</h1>
    <h1>${a==100}</h1>
    <h1>${a!=100}</h1>
    <h1>${empty a}</h1><%--判断是否为空--%>
    <h1>${email eq "110@qq.com"}</h1>
    <h1>${email eq "110@qq.com" ? "110的邮箱" : "不认识"}</h1>
    <h1>${a==100 && email eq "110@qq.com"}</h1>
    <h1>${a==100 || email eq "110@qq.com"}</h1>
    <h1>${!empty a}</h1>
    <h1>${!(a==100)}</h1>


</body>
</html>
