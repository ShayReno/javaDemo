<%--
  Created by IntelliJ IDEA.
  User: zx55y
  Date: 2019/5/25
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/findOrdersWithUser">
        <input type="text" name="ordersid" /><br>
        <input type="text" name="user.username" /><br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
