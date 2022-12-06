package com.cgi.cr.repositoryTests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cgi.cr.entity.Cart;
import com.cgi.cr.repository.CartRepository;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
public class CartRepositoryTests {

@Autowired
private CartRepository cartRepository;


@Test
@Order(1)
public void testNotNull() {
	assertNotNull(cartRepository);
}

@Test
@Order(2)
public void addCartTest() {
	Cart cr=new Cart("1","Model",30,"101");
	Cart c=this.cartRepository.save(cr);
	assertEquals(c.getCartid(),cr.getCartid());
	System.out.println("--SUCCESS ADD CART--");
}
@Test
@Order(3)
public void getAllCartTes() {
	List<Cart>list=new ArrayList();
	list.add(new Cart("1","Model",30,"101"));
	int s=this.cartRepository.findAll().size();
	System.out.println("--SUCCESS GET ALL CART--");
	
}
}


