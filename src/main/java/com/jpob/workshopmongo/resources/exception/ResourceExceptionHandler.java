package com.jpob.workshopmongo.resources.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.jpob.workshopmongo.services.exception.ObjectNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandartError> objectNotFound(HttpServletRequest request){
		
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandartError error = new StandartError(System.currentTimeMillis(), status.value(), "Not found", request.getRequestURI());
		
		return ResponseEntity.status(status).body(error);
	}
}
