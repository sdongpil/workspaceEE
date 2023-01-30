<%@page import="com.itwill.guest.GuestService"%>
<%@page import="com.itwill.guest.Guest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
/*
	GET방식이면 guest_main.jsp redirection
	0.요청객체encoding설정
	1.파라메타받기(guest_no)
	2.GuestService객체생성
	3.GuestService객체 delete(guest_no) 메쏘드호출
	4.guest_list.jsp로 redirection
*/


if(request.getMethod().equalsIgnoreCase("get")){
	response.sendRedirect("guest_main.jsp");
	return;
}
request.setCharacterEncoding("UTF-8");
String guest_no = request.getParameter("guest_no");
String guest_name = request.getParameter("guest_name");
String guest_email = request.getParameter("guest_email");
String guest_homepage = request.getParameter("guest_homepage");
String guest_title = request.getParameter("guest_title");
String guest_content = request.getParameter("guest_content");

System.out.println(guest_no);
System.out.println(guest_email);
System.out.println(guest_name);



Guest guest =  new Guest(Integer.parseInt(guest_no),guest_name,null,guest_email,guest_homepage,guest_title,guest_content);

GuestService guestService = new GuestService();
guestService.modify(guest);

response.sendRedirect("guest_list.jsp"); 
%>