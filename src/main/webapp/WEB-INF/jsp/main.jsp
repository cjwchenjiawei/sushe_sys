<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>主菜单</title>
</head>
<body>
<dl>
    <c:forEach items="${sessionScope.user.permissions}" var="p">
        <c:if test="${p.pid==0}">
            <dt>${p.permissionName}</dt>
        </c:if>
        <c:if test="${p.pid!=0}">
            <dd><a href="${p.moduleUrl}">${p.permissionName}</a></dd>
        </c:if>
    </c:forEach>
</dl>
</body>
</html>
