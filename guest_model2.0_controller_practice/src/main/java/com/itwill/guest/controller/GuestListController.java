package com.itwill.guest.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itwill.guest.Guest;
import com.itwill.guest.GuestService;
import com.itwill.summer.mvc.Controller;


/*
 * - 클라이언트요청한개를 처리하는 비즈니스로직을 담고있는 객체
 * - DispatcherServlet객체가 호출하는 handleRequest메쏘드를가짐
 * - handleRequest메쏘드가호출되면 DispatcherServlet객체에 forwardPath를 반환해줌
 */
public class GuestListController implements Controller {

	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String forwardPath = "";
		
		/*
		 * 1. UserService객체를 사용해서 ArrayList<Guest> 얻기
		 * 2. request scope객체에 담기[setAttribute()]
		 * 3. forwardPath반환
		 */
		GuestService guestService = new GuestService();
		try {
		ArrayList<Guest> guestList  = guestService.selectAll();
		request.setAttribute("guestList", guestList);		
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			forwardPath ="forward:/WEB-INF/views/guest_error.jsp";
		}
		
		forwardPath = "forward:/WEB-INF/views/guest_list.jsp";

		return forwardPath;
	}
}
