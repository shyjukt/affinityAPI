package com.affinity.awas.exception;

public class MasterException extends BusinessException{
	private static final long serialVersionUID = 1L;

	public MasterException(String code, String message) {
		super(code, message);
	}

	public MasterException(Exception originalException, String rootCauseMessage) {
		super(originalException, rootCauseMessage);
	}

	public MasterException(String code, String message, Exception originalException, String rootCauseMessage) {
		super(code, message);
	}

}
