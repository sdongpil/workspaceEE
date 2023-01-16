package com.itwill.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/gugudan.do")
public class GugudanServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<HTML>");
		out.println("<HEAD>");
		out.println("<meta charset='UTF-8'>");
		out.println("<TITLE>방가워요 서블릿</TITLE>");
		out.println("</HEAD>");
		out.println("<BODY>");
		out.println("<center><H2>서블릿 잘났어 정말 별꼴이야!!!!!!!!!</H2><center>");
		out.println("<img src='tomcat.svg'/>");
		out.println("<center><H2>서블릿 구구단</H2></center>");
		out.println("<table border=1 width=600 bgcolor=#CCFF33 bordercolordark=#FF6600 cellspacing=0>");

		out.print("<tr>");
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {

				out.print("<td align=center>" + j + "*" + i + "=" + i * j + " " + "</td>");
			}
			
			out.print("</tr>");
		}
		out.println("</table>");
		out.println("<br/>");
		out.println("</BODY>");
		out.println("</HTML>");

	}

}
