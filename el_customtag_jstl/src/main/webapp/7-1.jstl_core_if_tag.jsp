<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core_1_1" %>
<%
	session.setAttribute("sUserId", "guard");
	request.setAttribute("level", 4);

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>JSTL core if tag</h1>
<hr>
<c:if test="true">
	1.반드시 실행<br>
</c:if>
<c:if test="true">
	2.반드시 실행<br>
</c:if>

<c:if test="${level ==5 }">
4
</c:if>

<c:if test="${ level !=null && level>=5 }">

444

</c:if>

<c:if test="${!empty sUserId }">
${sUserId }
</c:if>

</body>
</html>
















