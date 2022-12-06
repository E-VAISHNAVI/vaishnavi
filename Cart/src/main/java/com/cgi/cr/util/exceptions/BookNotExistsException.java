package com.cgi.cr.util.exceptions;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND,reason = "News with specified details not found")
public class BookNotExistsException extends Exception {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public BookNotExistsException(String message){
		super(message);
	}

}

