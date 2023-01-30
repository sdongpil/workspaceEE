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
	
	public Guest selectByNo(int no)throws Exception{
		return guestDao.findByNo(no);
	}
	
	public int delete(int no) throws Exception {
		return guestDao.delete(no);
	}
	public int write(Guest guest) throws Exception {
		return guestDao.insert(guest);
	}
	
	public int modify(Guest guest) throws Exception {
		return guestDao.update(guest);
	}
}
