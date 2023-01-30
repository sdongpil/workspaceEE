package com.itwill.guest;

import java.util.List;

public class GuestServicetestMain {

	public static void main(String[] args) throws Exception {
		GuestService guestService = new GuestService();
//		int a = guestService.delete(5);
		Guest g = new Guest(28, "p2333", null, "em", "h", "t", "c");
//		 guestService.write(g);
		 
		 
		 guestService.modify(g);
	}

}
