<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>班级</title>
</head>
<body>
<c:forEach items="${sessionScope.myClasses}" var="c">
    ${c}<br>
</c:forEach>
</body>
</html>
