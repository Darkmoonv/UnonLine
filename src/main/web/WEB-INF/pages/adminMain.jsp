<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/27
  Time: 13:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>${admin.name}欢迎您!</h2>
<a href="${pageContext.request.contextPath}/admin/showUser.do"><h1>查看用户信息</h1></a>
<a href="${pageContext.request.contextPath}/user/pageInfoUser.do"><h1>查看分页用户信息</h1></a>
<a href="${pageContext.request.contextPath}/user/delUser.do"><h1>删除用户信息</h1></a>
<a href="${pageContext.request.contextPath}/user/replaceUser.do"><h1>修改用户信息</h1></a>
<a href="${pageContext.request.contextPath}/admin/admin/addUser.do"><h1>增加用户信息</h1></a>

</body>
</html>
