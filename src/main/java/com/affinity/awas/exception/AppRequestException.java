package com.affinity.awas.exception;

public class AppRequestException extends BusinessException{
	private static final long serialVersionUID = 1L;

	public AppRequestException(String code, String message) {
		super(code, message);
	}

	public AppRequestException(Exception originalException, String rootCauseMessage) {
		super(originalException, rootCauseMessage);
	}

	public AppRequestException(String code, String message, Exception originalException, String rootCauseMessage) {
		super(code, message);
	}

}
