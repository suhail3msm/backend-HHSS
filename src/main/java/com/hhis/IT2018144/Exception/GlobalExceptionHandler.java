package com.hhis.IT2018144.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler
	public ResponseEntity handleException(Exception ex) {

		APIExceptionResponse apiResponse = new APIExceptionResponse();
		apiResponse.setError("Oops.. Samething went wrong!");
		apiResponse.setStatus(HttpStatus.BAD_REQUEST.value());

		return ResponseEntity.status(HttpStatus.BAD_REQUEST.value()).body(apiResponse);
	}

}
