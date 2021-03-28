package com.softcaribbean.apiclients.exceptions;

import java.sql.SQLSyntaxErrorException;

import com.softcaribbean.apiclients.models.common.ResponseError;
import com.softcaribbean.apiclients.models.common.ResponseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomGlobalExceptionHandler extends ResponseEntityExceptionHandler {

	@Autowired
	private ResponseService responseService;
	
	@Autowired
	private ResponseError responseError;

	@ExceptionHandler(SQLSyntaxErrorException.class)
	public ResponseEntity<ResponseService> handlerErrorSQL(Exception ex, WebRequest request) {
		
		responseError.setSystemError("Mysql");
		responseError.setCodeError(0001);
		responseError.setDetailError(ex.getMessage());
		responseError.setTypeError("BDA");

		responseService.setTipoRespuesta("ER");
		responseService.setResponseError(responseError);

		return new ResponseEntity<>(responseService, HttpStatus.INTERNAL_SERVER_ERROR);

	}	
	

}

