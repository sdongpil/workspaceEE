package com.itwill.guest.controller;

import java.io.IOException;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itwill.guest.GuestService;

/**
 * Servlet implementation class GuestWriteFormSevlet
 */
@WebServlet("/guest_remove_action.do")
public class GuestRemoveActionServlet extends HttpServlet {
	private GuestService guestService;

	public GuestRemoveActionServlet() throws Exception {
		guestService = new GuestService();
		// TODO Auto-generated constructor stub
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String forwardPath = "";
		

		try {

			if (request.getMethod().equalsIgnoreCase("GET")) {
				forwardPath = "redirect:guest_main.do";
			} else {
				String guest_noStr = request.getParameter("guest_no");
				int deleteRowCount = guestService.delete(Integer.parseInt(guest_noStr));
				forwardPath = "forward:/WEB-INF/views/guest_remove_action.jsp";
			}
		} catch (Exception e) {
			forwardPath = "forward:/WEB-INF/views/guest_error.jsp";
		}

		
		String[] pathArray = forwardPath.split(":");
		String forwardOrRedirect = pathArray[0];
		String path = pathArray[1];

		if (forwardOrRedirect.equals("redirect")) {

			response.sendRedirect(path);

		} else {
			// forwarding
			RequestDispatcher rd = request.getRequestDispatcher(path);
			rd.forward(request, response);
		}

	}

}
