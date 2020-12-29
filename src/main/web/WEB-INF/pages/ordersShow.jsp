<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
</head>
<body>
<h1>展示全部货物内容</h1>
<a href="${pageContext.request.contextPath}/user/loginOut.do"><h1>退出</h1></a>
<table>
    <tr>
        <th>货物编号</th>
        <th>货物名称</th>
        <th>货物价格</th>
        <th>货物数量</th>
        <th>货物描述</th>
    </tr>
    <c:forEach items="${ordersList}" var="order">
        <tr>
            <td>${order.id}</td>
            <td>${order.g_name}</td>
            <td>${order.price}</td>
            <td>${order.total}</td>
            <td>${order.describe}</td>
            <td><a href="${pageContext.request.contextPath}/orders/buy.do?${order.id}">加入购物车</a></td>
        </tr>
    </c:forEach>
</table>
<ul><li><a href="${pageContext.request.contextPath}/orders/buy.do">清空购物车</a></li></ul>
</body>
</html>
