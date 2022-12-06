package com.cgi.cr.Vo;

import org.springframework.core.annotation.Order;

import com.cgi.cr.entity.Cart;

public class ResponseTemplateVo {

	private Order order;
	private Cart cart;
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public ResponseTemplateVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
