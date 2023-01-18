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
@WebServlet("/post_login.do")
public class PostLoginServelt extends HttpServlet {
	
	@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			super.service(req, resp);
		}
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect(getServletInfo());
		
	}
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
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
			response.sendRedirect("05-02.login_post.html");
			return;
		
		}
		
		
		/*
		 * 2.로그인업무실행(service객체사용)
		 * 
		 */
		boolean isMember1 = id.equals("xxxx")&& pass.equals("1111");
		boolean isMember2 = id.equals("yyyy")&& pass.equals("2222");
		
		out.println("<h1>post 로그인 결과</h1>");
		if(isMember1 || isMember2) {
			out.println(id+"님 로그인성공");
		}else {
//			out.println(id+"로그인  실패");
//			out.println("<a href = 05-02.login_post.html >05-02.login_post.html </a>");
		}

	}

}
