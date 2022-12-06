package com.cgi.cr.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cart {

	@Id
	private String cartid;
	private String booktitle;
	private String bookid;
	private int quantity;
	
	
	public String getBookid() {
		return bookid;
	}

	public void setBookid(String bookid) {
		this.bookid = bookid;
	}

	

	public String getCartid() {
		return cartid;
	}

	public void setCartid(String  cartid) {
		this.cartid = cartid;
	}

	public String getBooktitle() {
		return booktitle;
	}

	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Cart() {
		System.out.println("CART CREATED SUCCESSFULLY");
	}

	public Cart(String  id, String booktitle, int quantity,String bookid) {
		super();
		this.cartid = id;
		this.booktitle = booktitle;
		this.quantity = quantity;
		this.bookid=bookid;
	}

	@Override
	public String toString() {
		return "Cart [cartid=" + cartid + ", booktitle=" + booktitle + ", bookid=" + bookid + ", quantity=" + quantity
				+ "]";
	}

	
	


	
	
	
	
	
	
}

