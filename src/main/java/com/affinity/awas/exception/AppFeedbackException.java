package com.affinity.awas.exception;

public class AppFeedbackException extends BusinessException{
	private static final long serialVersionUID = 1L;

	public AppFeedbackException(String code, String message) {
		super(code, message);
	}

	public AppFeedbackException(Exception originalException, String rootCauseMessage) {
		super(originalException, rootCauseMessage);
	}

	public AppFeedbackException(String code, String message, Exception originalException, String rootCauseMessage) {
		super(code, message);
	}

}
