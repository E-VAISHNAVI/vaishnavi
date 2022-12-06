package com.cgi.cr.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cgi.cr.Vo.BookOrder;
import com.cgi.cr.Vo.ResponseTemplateVo;
import com.cgi.cr.entity.Cart;
import com.cgi.cr.service.CartService;
import com.cgi.cr.util.exceptions.BookAlreadyExistsException;
import com.cgi.cr.util.exceptions.BookNotExistsException;


@RestController
@RequestMapping("/api/cart")
public class CartController {

	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private CartService cartservice;
	private final Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@PostMapping
	public ResponseEntity<?> addBook(@RequestBody Cart book) throws BookAlreadyExistsException {
		Cart newbook = cartservice.addBook(book);
		logger.info("In controller -{}","NewBook: "+newbook); 
		if ( newbook != null)
			return new ResponseEntity<Cart>(newbook,HttpStatus.CREATED);
		logger.info("In controller - {}","NewBook"+newbook+" not found.");
		return new ResponseEntity<String>("Book not added in Cart",HttpStatus.CONFLICT);
	}

	@GetMapping
	public ResponseEntity<?> getAllBooks()  throws BookNotExistsException{
		
		List<Cart> booklist = cartservice.getAllBooks();
		logger.info("In controller -{}","List of all orders: "+booklist); 
		if ( booklist.size() > 0)
			return new ResponseEntity<List<Cart>>(booklist,HttpStatus.OK);
		logger.info("In controller -{}","New Book " +booklist+"Empty");
		return new ResponseEntity<String>("Cart list is empty",HttpStatus.OK);
	}
	@DeleteMapping("/{bookId}")
	public ResponseEntity<?> deleteBook(@PathVariable String bookId) {
		
		Cart deletedbook = cartservice.delBook(bookId);
		logger.info("In controller -{}","Deleted Books: "+deletedbook);
		if ( deletedbook != null)
			return new ResponseEntity<Cart>(deletedbook,HttpStatus.OK);
		logger.info("In controller -{}","New Book " +deletedbook+ "not found");
		return new ResponseEntity<String>("Book not Deleted in cart",HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseTemplateVo getCartAndBookOrder(@PathVariable("id") String id) {
		// first get the employee details based on id
		Cart cart = this.cartservice.getbycartid(id);
		if (cart != null) {
			// Get the department details from the DEPARTMENT-SERVICE by using RestTemplate
			BookOrder order = this.restTemplate
					.getForObject("http://ORDER-SERVICE/order/" + cart.getCartid(),BookOrder.class);
			ResponseTemplateVo rt = new ResponseTemplateVo();
			if (cart!= null && order!= null) {
				rt.setCart(cart);
				rt.setOrder(null);
				return rt;
			} else {
				return new ResponseTemplateVo();
			}
		} else 
		{
			return new ResponseTemplateVo();
		}
	
}
}



	

