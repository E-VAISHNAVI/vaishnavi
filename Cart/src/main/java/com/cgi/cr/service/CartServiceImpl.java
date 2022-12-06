package com.cgi.cr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.cr.entity.Cart;
import com.cgi.cr.repository.CartRepository;

@Service
public class CartServiceImpl implements CartService{
	
	@Autowired
	private CartRepository cartRepository;

	@Override
	public Cart addBook(Cart cart) {
		
		return cartRepository.save(cart);
	}

	@Override
	public List<Cart> getAllBooks() {
		
		return cartRepository.findAll();
	}
	@Override
	public Cart delBook(String bookid) {
		
		if(cartRepository.findByBookid(bookid) != null) {
			Cart deletedbook = cartRepository.findByBookid(bookid);
			cartRepository.deleteById(bookid);
			return deletedbook;
		}else {
			return null;
		}
	}

	@Override
	public Cart getbycartid(String id) {
		
		return cartRepository.getById(id);
	}

	
}


