<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%

	session.setAttribute("sUserId", "admin");
	session.setAttribute("sUserId", "guard");
	session.setAttribute("level", "3");
	
	
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>JSTL core choose tag</h1><hr>

<c:choose>
	<c:when test="${level == 1 }">
		 초보
	</c:when>
	
	<c:when test="${level == 2 }">
			중수
	</c:when>
	
	<c:when test="${level == 3 }">
	   3
	</c:when>
	
	<c:when test="${level == 4 }">
	4
	</c:when>
	
</c:choose>
















</body>
</html>