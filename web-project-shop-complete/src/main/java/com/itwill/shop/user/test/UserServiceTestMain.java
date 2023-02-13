package com.itwill.shop.user.test;

import com.itwill.shop.user.User;
import com.itwill.shop.user.UserService;

public class UserServiceTestMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		UserService service = new UserService();
		
		User user = service.login("guard2", "1211");
		System.out.println(user);
		
	}

}
