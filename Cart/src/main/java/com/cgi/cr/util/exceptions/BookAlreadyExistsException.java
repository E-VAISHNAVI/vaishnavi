package com.cgi.cr.util.exceptions;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT,reason = "News already exists")
public class BookAlreadyExistsException extends Exception {

		/**
		 *
		 */
		private static final long serialVersionUID = 1L;

		public BookAlreadyExistsException(String message){
			super(message);
		}

	}


