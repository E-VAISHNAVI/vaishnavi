package com.cgi.cr;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cgi.cr.repository.CartRepository;

@SpringBootTest
class CartApplicationTests {
	
@Autowired
private CartRepository cartRepository;

	@Test
	public void testNotNull() {
		assertNotNull(cartRepository);
	}

}
