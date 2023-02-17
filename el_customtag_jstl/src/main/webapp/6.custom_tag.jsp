<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="itwill" uri="http://www.itwill.co.kr/jsp/simpleTag" %>
<%
	session.setAttribute("sUserId", "guard");
	request.setAttribute("name", "현빈");
%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body >
<h1>custom tag[사용자정의태그]</h1><hr/>
---------------hello tag----------------------<br>
<itwill:hello/>

---------------helloAttr tag----------------------<br>
<itwill:helloAttr irum = "김경호" />
<itwill:helloAttr irum = "공유"/>
<itwill:helloAttr irum = "${name }"/>

---------------if tag[body]----------------------<br>
<itwill:if test="${sUserId ==null }">
guest in <br>
</itwill:if>

<itwill:if test="${sUserId !=null }">
${sUserId } in <br>
</itwill:if>

<itwill:if test="${empty sUserId }">
	<a href = "user_login_form.jsp">로그인</a>
</itwill:if>

<itwill:if test="${!empty sUserId }">
	<a href = "user_logout_action.jsp">${sUserId }로그아웃</a>
</itwill:if>












</body>
</html>