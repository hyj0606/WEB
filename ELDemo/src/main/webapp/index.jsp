<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>

      <%

        request.setAttribute("name","laowang");
        session.setAttribute("name","laozhang");
        application.setAttribute("name","laozhao");
        pageContext.setAttribute("name","laoli");

      %>
      <%--
        EL表达式:
            1.解析域对象使用.
      --%>
      <ul>
          <li>${requestScope.name}</li>
          <li>${sessionScope.name}</li>
          <li>${applicationScope.name}</li>
          <li>${pageScope.name}</li>

          <%--特殊: 未指定取值范围时,将默认依次从page=>request=>session=>application解析,找到即返回,否则直至找到结尾返回空--%>
          <li>${name}</li>
          <li>${name2}</li>
      </ul>


</body>
</html>