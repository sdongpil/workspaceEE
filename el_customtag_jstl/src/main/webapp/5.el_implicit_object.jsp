<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="true"%>
<%
pageContext.setAttribute("url", "page.jsp");
request.setAttribute("url", "r.jsp");
session.setAttribute("url", "s.jsp");
application.setAttribute("url", "a.jsp");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>EL 내장객체(implicit object) 타입은맵이다.</h1><hr>
<ul>
	<li>---pageScope,requestScope,sessionScope,applicationScope---</li>
	<li>${url }</li>
	<li>${pageScope.url }</li>
	<li>${requestScope['url'] }</li>
	<li>${sessionScope.url }</li>
	
	
	<li>--------param---------</li>
	
	
	<li>${param.id }</li>
	<li>${param.name }</li>
	<li>${param.hobby}</li>
	

	
	<li>--------paramValues---------</li>
	
	<%
	for(int i=0;i<3;i++){
		pageContext.setAttribute("index", i);
	%>
		
		<li>${paramValues.hobby[index] }</li>
	<%}%>
	
		
	   
	
	<li>--------cookie---------</li>
	
	 <li>${cookie }</li> 
	<li>${cookie.JSESSIONID.name}</li>
	<li>${cookie.JSESSIONID.value }</li>
	
	<li>--------pageContext[빈객체]---------</li>
	
	<li>${pageContext.out }</li>
	<li>${pageContext.request.contextPath}</li>
	<li>${pageContext.response }</li>
	<li>${pageContext.session.creationTime}</li>
	
</ul>	

	
	
	
</ul>
</body>
</html>