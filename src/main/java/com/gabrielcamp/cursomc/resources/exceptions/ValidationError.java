package com.gabrielcamp.cursomc.resources.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError{
	private static final long serialVersionUID = 1L;
	
	public List<FieldMessage> errors = new ArrayList<FieldMessage>();
		
	public ValidationError(Integer status, String msg, Long timestamp) {
		super(status, msg, timestamp);
	}

	public List<FieldMessage> getErrors() {
		return errors;
	}

	public void addError(String fieldName, String message) {
		errors.add(new FieldMessage(fieldName, message));
	}	

}
