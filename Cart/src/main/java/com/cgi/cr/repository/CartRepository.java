package com.cgi.cr.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cgi.cr.entity.Cart;
@Repository
public interface CartRepository extends JpaRepository<Cart, String> {

	
	Cart findByBookid(String bookid);

}