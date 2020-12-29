<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="../../JS/jquery-3.5.1.min.js"></script>
</head>
<body>
<h3>${success}</h3>
<form action="${pageContext.request.contextPath}/user/login.do" method="post">
    <input type="text" id="username" name="username" placeholder="请输入用户名">
    <input type="text" id="password" name="password" placeholder="请输入密码">
    <button type="submit">登录</button>
</form>
</body>
</html>
