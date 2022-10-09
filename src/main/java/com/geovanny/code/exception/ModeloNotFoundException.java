package com.geovanny.code.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ModeloNotFoundException extends RuntimeException {
	
	public ModeloNotFoundException(String mensaje)
	{
		super(mensaje);
	}

}

