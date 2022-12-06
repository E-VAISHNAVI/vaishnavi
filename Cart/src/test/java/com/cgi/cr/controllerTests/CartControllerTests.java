package com.cgi.cr.controllerTests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.http.MediaType;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.plugins.MockMaker;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import com.cgi.cr.controller.CartController;
import com.cgi.cr.entity.Cart;
import com.cgi.cr.service.CartService;

@WebMvcTest(value=CartController.class)
public class CartControllerTests {
	
private static final RequestBuilder MockMvcRequestBuilders = null;
@Autowired
private MockMvc mvc;
@MockBean
private CartService cartService;
private Object booklist;

@Test
public void testNotNull() {
	assertNotNull(cartService);
	assertNotNull(mvc);
}
}