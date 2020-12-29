<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <th>订单号</th>
    <th>订单日期</th>
    <th>订单购买人</th>
    <th>订单货物</th>
    <c:forEach items="${danList}" var="dan" varStatus="status">
        <tr>
            <td>${dan.id}</td>
            <td>${dan.date}</td>
            <td><c:forEach items="${dan.userList}" var="user">
                ${user.username}
            </c:forEach> </td>
            <td><c:forEach items="${dan.ordersList}" var="order">
                ${order.g_name}
            </c:forEach></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
