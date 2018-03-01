package com.affinity.awas.exception;

public class PersonException extends BusinessException{
	private static final long serialVersionUID = 1L;

	public PersonException(String code, String message) {
		super(code, message);
	}

	public PersonException(Exception originalException, String rootCauseMessage) {
		super(originalException, rootCauseMessage);
	}

	public PersonException(String code, String message, Exception originalException, String rootCauseMessage) {
		super(code, message);
	}
}
