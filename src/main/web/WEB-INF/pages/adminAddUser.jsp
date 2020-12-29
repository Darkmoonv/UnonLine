<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/23
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/admin/addAdmin.do" method="post">
    <input type="text" name="name" placeholder="请输入真实用户名">
    <input type="text" name="username" placeholder="请输入用户名">
    <input type="text" name="password" placeholder="请输入密码">
    <input type="text" name="admin" placeholder="请输入是否是管理员(0/1)">
    <button type="submit">保存</button>
</form>
</body>
</html>
