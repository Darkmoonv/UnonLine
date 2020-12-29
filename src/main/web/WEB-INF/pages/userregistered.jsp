<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="../../JS/jquery-3.5.1.min.js"></script>
    <script>
        $(function () {
            $("#u_name").blur(function () {
                var username=$(this).val();
                $.ajax("${pageContext.request.contextPath}/user/registered",{username:username},function (zs) {
                    var userdata=$("#u_data");
                    var success=$("#success");
                    if (zs.userExit){
                        $(userdata).html(zs.msg);
                        $(success).html(zs.tishi);
                    }else {
                        $(userdata).html(zs.msg);
                        $(success).html(zs.tishi);
                    }
                },"json")
            })
        })
    </script>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/registered.do" method="post">
    <%--<input type="text" id="u_id" name="id" placeholder="请输入用户编号">--%>
    <input type="text" name="name" placeholder="请输入用户真实姓名"><br>
    <input type="text" id="u_name" name="username" placeholder="请输入用户名"><br>
    <input type="text" name="password" placeholder="请输入用户密码">
    <input type="text" name="admin" placeholder="是否为管理员(0/1)">
        <br>
    <input type="submit" value="注册">
</form>

</body>
</html>
