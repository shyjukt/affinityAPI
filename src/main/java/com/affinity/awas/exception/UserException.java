package com.affinity.awas.exception;

public class UserException extends BusinessException{
	private static final long serialVersionUID = 1L;

	public UserException(String code, String message) {
		super(code, message);
	}

	public UserException(Exception originalException, String rootCauseMessage) {
		super(originalException, rootCauseMessage);
	}

	public UserException(String code, String message, Exception originalException, String rootCauseMessage) {
		super(code, message);
	}
}
