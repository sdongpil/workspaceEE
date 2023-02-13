<%@page import="com.itwill.hellomart.cart.Cart"%>
<%@page import="java.util.List"%>
<%@page import="com.itwill.hellomart.cart.CartService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%		
		CartService cartService = new CartService();
		List<Cart> cartList = cartService.getCartListByUserId("guard1");
		
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>