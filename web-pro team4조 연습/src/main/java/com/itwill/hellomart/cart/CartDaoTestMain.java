package com.itwill.hellomart.cart;
public class CartDaoTestMain {
	public static void main(String[] args) throws Exception{
		CartDao cartDao=new CartDao();
//		System.out.println("--------cart list------");
//		System.out.println(cartDao.findByUserId("guard1"));
		
		
		System.out.println("--------cart add------");
//		System.out.println(cartDao.insert("guard1", 4, 1));
		System.out.println(cartDao.insert("a", 12, 1));
		
	}
}
