<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>学生</title>
</head>
<body>
    <c:forEach items="${sessionScope.students}" var="s">
        ${s}<br>
    </c:forEach>
</body>
</html>
