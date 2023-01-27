package com.itwill.guest;

import java.util.List;

public class GuestService {
	private GuestDao guestDao;

	public GuestService() throws Exception {
		guestDao = new GuestDao();
	}

	public List<Guest> findAll() throws Exception {
		return guestDao.findAll();

	}
}
