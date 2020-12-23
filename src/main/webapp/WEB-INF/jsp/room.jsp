<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>房间</title>
</head>
<body>
<c:forEach items="${sessionScope.homes}" var="h">
    ${h}<br>
</c:forEach>
</body>
</html>
