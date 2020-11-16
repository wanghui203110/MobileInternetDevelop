<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/5
  Time: 17:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h3>查询所有的账户信息</h3>

    <c:forEach items="${list}" var="accot">
        ${accot.name}
    </c:forEach>

</body>
</html>
