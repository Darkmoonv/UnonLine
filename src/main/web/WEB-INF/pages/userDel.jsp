<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/29
  Time: 11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/delUser.do" method="post">
<input type="text" id="username" name="username" placeholder="请输入用户名"/>
<input type="text" id="password" name="password" placeholder="请输入密码"/>
<button type="submit">注销</button>
</form>
</body>
</html>
