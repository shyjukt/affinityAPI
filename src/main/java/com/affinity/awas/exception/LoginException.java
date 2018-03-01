package com.affinity.awas.exception;

public class LoginException extends BusinessException{
	private static final long serialVersionUID = 1L;

	public LoginException(String code, String message) {
		super(code, message);
	}

	public LoginException(Exception originalException, String rootCauseMessage) {
		super(originalException, rootCauseMessage);
	}

	public LoginException(String code, String message, Exception originalException, String rootCauseMessage) {
		super(code, message);
	}

}
