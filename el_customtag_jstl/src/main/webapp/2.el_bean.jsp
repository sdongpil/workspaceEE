<%@page import="com.itwill.bean.Student"%>
<%@page import="com.itwill.bean.Car"%>
<%@page import="com.itwill.bean.User"%>
<%@page import="com.itwill.bean.Guest"%>
<%@page import="java.util.Date"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	
	Car c = new Car(1,"테슬라","red");
	Student s = new Student(100,"백학생",new Car(2,"소나타","white"));
	
	request.setAttribute("car", c);
	request.setAttribute("student", s);
	

%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>EL 자바 Bean객체의 property(멤버변수)출력</h1><hr/>
<ul>


<li>${car }</li>
<li>${car.no }</li>
<li>${car.model }</li>
<li>${car.color }</li>
<li>${student.car.model }</li>
<li>${student.car.color }</li>
<li>${student.no }</li>
<li>${today }</li>
	
	
</ul>
</body>
</html>