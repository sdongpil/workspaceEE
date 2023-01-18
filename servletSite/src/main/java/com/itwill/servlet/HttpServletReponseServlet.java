package com.itwill.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HttpServletReponseServlet
 */
@WebServlet("/response.do")
public class HttpServletReponseServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		String cmd = request.getParameter("cmd");
		if (cmd == null || cmd.equals("")) {
//				out.println("<h1>다시요청</h1>");
//				out.println("<a href = '04.HttpServletResponse.html' >04.HttpServletResponse.html</a>");

			response.sendRedirect("04.HttpServletResponse.html");
			return;

		}
		if (cmd.equals("1")) {
			out.println("<h3>정상응답</h3><br>");
		} else if (cmd.equals("2")) {
//				response.sendError(403);
			response.sendError(HttpServletResponse.SC_ACCEPTED);
		} else if (cmd.equals("3")) {
//				response.sendRedirect("05-03.form1.html");
			response.sendRedirect("./lifecycle_image_counter.do");
		} else {

		}

	}

}
