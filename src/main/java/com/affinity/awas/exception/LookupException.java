package com.affinity.awas.exception;

public class LookupException extends BusinessException{
	private static final long serialVersionUID = 1L;

	public LookupException(String code, String message) {
		super(code, message);
	}

	public LookupException(Exception originalException, String rootCauseMessage) {
		super(originalException, rootCauseMessage);
	}

	public LookupException(String code, String message, Exception originalException, String rootCauseMessage) {
		super(code, message);
	}

}
