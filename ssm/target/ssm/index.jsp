<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/5
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <a href="accot/findAll">测试查询</a>

    <h3>测试包</h3>

    <form action="accot/save" method="post">
        姓名：<input type="text" name="name" /><br/>
        金额：<input type="text" name="money" /><br/>
        <input type="submit" value="保存" /><br/>
    </form>

</body>
</html>
