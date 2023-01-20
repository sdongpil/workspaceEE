<%@page import="com.itwill.address.Address"%>
<%@page import="com.itwill.address.AddressService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
/*
 * 요청URL
 *   http://localhost/addressSite/address_detail.jsp?no=45
 
 *  0.요청객체encoding설정
 *  1.no 파라메타받기
 *  2.AddressService객체생성
 *  3.AddressService객체 selectByNo(no) 메쏘드호출
 *  4.Address객체 출력
 */
  request.setCharacterEncoding("UTF-8");
  String noStr=request.getParameter("no");	
  if(noStr==null|| noStr.equals("")){
	  response.sendRedirect("address_main.jsp");
	  return;
  }
  AddressService addressService=new AddressService();
  Address address=addressService.findByNo(Integer.parseInt(noStr));
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
<title>Insert title here</title>
</head>
<body>


<h1>[<%=address.getName()%> 님 주소록상세보기]</h1><hr>
<div>
	<a href='address_main.jsp'>[메인]</a>
	<a href='address_insert_form.jsp'>[주소록쓰기폼]</a>
	<a href='address_list.jsp'>[주소록리스트]</a>
	<%-- 
	<a href='address_update_form.jsp?no=<%=address.getNo()%>'>[<%=address.getName() %>님 주소록수정폼GET]</a>
	 --%>
	<form action="address_update_form.jsp" method="post" style="display: inline;">
		<input type="hidden" name="no" value="<%=address.getNo()%>">
		<input type="submit" value="<%=address.getName() %>님 주소록수정폼[POST]">	
	</form> 
	<%-- 
	<a href='address_delete_action.jsp?no=<%=address.getNo()%>'><%=address.getName()%>님삭제[GET]</a>
	--%>
	<form action='address_delete_action.jsp' method='post' style='display:inline;'>
		<input type='hidden' name='no' value='<%=address.getNo()%>'>
		<input type='submit' value='<%=address.getName() %>님삭제[POST]'>
	</form>
</div>
<p>
	번호:<%=address.getNo()%><br>
	이름:<%=address.getName()%><br>
	전화:<%=address.getPhone()%><br>
	주소:<%=address.getAddress()%><br>
</p>
</body>
</html>
