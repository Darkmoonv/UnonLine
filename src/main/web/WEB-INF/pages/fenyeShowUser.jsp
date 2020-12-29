<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
    </tr>
    <c:forEach items="${pageInfo.list}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.username}</td>
            <td>${user.password}</td>
        </tr>
    </c:forEach>
</table>
<ul>
    <li><a href="${pageContext.request.contextPath}/user/pageInfoUser.do?pageNum=1&pageSize=${pageInfo.pageSize}">首页</a></li>
    <li><a href="${pageContext.request.contextPath}/user/pageInfoUser.do?pageNum=${pageInfo.pageNum+1}&pageSize=${pageInfo.pageSize}">下一页</a></li>
    <c:forEach begin="1" end="${pageInfo.pages}" var="pageNumber">
        <li>
        <li><a href="${pageContext.request.contextPath}/user/pageInfoUser.do?pageNum=${pageNumber}&pageSize=${pageInfo.pageSize}">${pageNumber}</a></li>
        </li>
    </c:forEach>
    <li><a href="${pageContext.request.contextPath}/user/pageInfoUser.do?pageNum=${pageInfo.pageNum-1}&pageSize=${pageInfo.pageSize}">上一页</a></li>
    <li><a href="${pageContext.request.contextPath}/user/pageInfoUser.do?pageNum=${pageInfo.pages}&pageSize=${pageInfo.pageSize}">尾页</a></li>
</ul>
</body>
</html>
