package com.cgi.cr.ServiceTests;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import org.mockito.InjectMocks;
import org.mockito.Mock;



import com.cgi.cr.repository.CartRepository;
import com.cgi.cr.service.CartService;


public class CartServiceTests {
	@InjectMocks
	private CartService cartService;
	
	@Mock
	private CartRepository cartRepository;
	
	
	@Test
	public void getNotNullTest() {
		

	}
	
}
	