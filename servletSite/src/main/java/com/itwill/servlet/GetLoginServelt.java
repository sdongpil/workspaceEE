package com.itwill.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetLoginServelt
 */
@WebServlet("/get_login.do")
public class GetLoginServelt extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		/*
		 * 1.요청시 전송되는 파라메타받기
		 * 
		 */
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		if(id == null || id.equals("") || pass ==null || pass.equals("")) {
			response.sendRedirect("05-01.login_get.html");
			return;
		
		}
		
		
		/*
		 * 2.로그인업무실행(service객체사용)
		 * 
		 */
		boolean isMember1 = id.equals("xxxx")&& pass.equals("1111");
		boolean isMember2 = id.equals("yyyy")&& pass.equals("2222");
		
		out.println("<h1>get 로그인 결과</h1>");
		if(isMember1 || isMember2) {
			out.println(id+"님 고로그인성공");
		}else {
			out.println(id+"로그인  실패");
//			response.sendRedirect("05-01.login_get.html");
		}

	}

}
