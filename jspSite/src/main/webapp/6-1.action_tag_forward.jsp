<%@page import="com.itwill.student.Student"%>
<%@page import="javax.rmi.CORBA.Stub"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	System.out.println("6-1.action_forward.jsp");
	/*
	forwarding
	-6-1.action_tag_forwarded.jsp 로 HTTP요청을 보냄
	
	*/
	request.setAttribute("id","guard" );
	request.setAttribute("name","김경호" );
	request.setAttribute("age",34 );
	request.setAttribute("student", new Student());
	
	RequestDispatcher rd = request.getRequestDispatcher("6-1.action_forward.jsp");
	rd.forward(request, response);
%>
<jsp:forward page="6-1.action_tag_forwarded.jsp"/>
