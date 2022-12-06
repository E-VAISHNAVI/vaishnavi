package com.cgi.cr.service;

import java.util.List;

import org.aspectj.weaver.ast.Var;

import com.cgi.cr.entity.Cart;

public interface CartService {

	public Cart addBook(Cart cart);
	 public List<Cart> getAllBooks();
	 public Cart delBook(String bookId);
	
	public Cart getbycartid(String id);
}
