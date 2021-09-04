package com.tiagoribeiro.cursomc.resources.exception;

import java.util.ArrayList;
import java.util.List;

import com.tiagoribeiro.cursomc.services.exceptions.StandardError;

public class ValidationError extends StandardError {
	private static final long serialVersionUID = 1L;
	
	private List<FieldMessage> errors = new ArrayList<>();
	public ValidationError(Integer status, String msg, Long timeStamp) {
		super(status, msg, timeStamp);
		// TODO Auto-generated constructor stub
	}
	public List<FieldMessage> getErrors() {
		return errors;
	}
	public void addError(String fieldName, String messagem) {
		errors.add(new FieldMessage(fieldName, messagem));
	}

	

}
