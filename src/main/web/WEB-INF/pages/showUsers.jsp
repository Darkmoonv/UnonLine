<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>用户编号</th>
        <th>用户姓名</th>
        <th>用户名</th>
        <th>用户密码</th>
        <th>用户身份</th>
    </tr>
    <c:forEach items="${userList}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.username}</td>
            <td>${user.password}</td>
            <td><c:forEach items="${user.roleList}" var="role">
                ${role.role_name}
            </c:forEach> </td>
        </tr>
    </c:forEach>
   <%-- 分页
   <c:forEach items="${pageInfo.list}" var="pageUser">
        <tr>
            <td>${pageUser.id}</td>
            <td>${pageUser.name}</td>
            <td>${pageUser.username}</td>
            <td>${pageUser.password}</td>
        </tr>
    </c:forEach>--%>
</table>
</body>
</html>
