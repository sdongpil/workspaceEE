package com.itwill.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Serch
 */
@WebServlet("/search.do")
public class SerchServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		
		/*
		 * 클라이언트 요청 URL
		 * 	- http://192.168.15.31/servletSite/search.do?searchkeyword=java
		 * 	- http://192.168.15.31/servletSite/search.do?searchkeyword=
		 * 	- http://192.168.15.31/servletSite/search.do
		 */
		
		/*
		 * 1.요청객체를사용해서 요청시 전송되는 쿼리스트링에 있는 파라메타받기
		 *    - 파라메타이름은 input element의 name속성과일치
		 *       <input type="text" name="searchkeyword">
		 *    - search.do?searchkeyword=java   
		 */
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String searchkeword = request.getParameter("searchkeyword");
		if(searchkeword == null || searchkeword.equals("")) {
//			searchkeword 가 null > search.do
//			searchkeword ""  > search.do?searchkeword =
			
			out.println("검색어를 입력하지 않은 경우 재미있는 지식 결과를 랜덤하게 보여드립니다.<br>");
			out.println("<a href = 05-00.search_form.html >검색페이지</a>");
			return;
		}
		/*
		 * 2.업무실행 -->Service객체사용
		 */
		
		
		/*
		 * 3.클라이언트로 검색결과전송(html)
		 */
		out.println("<h1> "+searchkeword +"  </h1>");
		
		int rNum = (int)(Math.random()*10);
		for(int i = 0; i <rNum; i++) {
			out.println("<li>"+searchkeword+"</li>");
		}
		out.println("<a href = 05-00.search_form.html > 검색페이지  </a>");
		
		
		
		
		
		
	}

}
