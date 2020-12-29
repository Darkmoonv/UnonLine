<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>${user.username}欢迎您!</h2>
<a href="${pageContext.request.contextPath}/orders/showOrders.do">显示所有货物</a>
<a href="${pageContext.request.contextPath}/user/userReplace.do">修改用户信息</a>
<a href="${pageContext.request.contextPath}/user/userDel.do">注销用户</a>
</body>
</html>
