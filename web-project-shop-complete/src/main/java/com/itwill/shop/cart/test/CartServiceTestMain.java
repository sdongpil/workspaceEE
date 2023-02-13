package com.itwill.shop.cart.test;

import java.util.List;

import com.itwill.shop.cart.Cart;
import com.itwill.shop.cart.CartDao;
import com.itwill.shop.cart.CartService;

public class CartServiceTestMain {

	public static void main(String[] args) throws Exception {

		CartService cartService = new CartService();
		List<Cart> cartList = cartService.getCartItemByUserId("guard4");
		
		for (Cart cart : cartList) {
			System.out.println(cart);

		}

//		CartService cartService = new CartService();
//		List<Cart> cartList = cartService.getCartItemByUserId("guard4");
//		
//		if (cartList == null) {
//			System.out.println(cartList);
//			System.out.println("담은 상품이 없습니다");
//		} else {
//			for (Cart cart : cartList) {
//				System.out.println(cart);
//			}
//		}
	}

}
