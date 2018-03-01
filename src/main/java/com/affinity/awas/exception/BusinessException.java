package com.affinity.awas.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

public class BusinessException extends Exception{
	private static final long serialVersionUID = 1991264531964330664L;
	public static final String BAD_REQUEST = "400";
	protected String code;
	protected String message;
	private String stackTrace;
	public Exception originalException;
	private String rootCauseMessage;

	public BusinessException(String code, String message) {
		super(message);
		this.code = code;
		this.message=message;
	}


	public BusinessException(Exception originalException, String rootCauseMessage) {
		super(originalException.toString());
		this.originalException = originalException;
		StringWriter sw = new StringWriter();
		originalException.printStackTrace(new PrintWriter(sw));
		this.stackTrace = sw.toString();
		this.rootCauseMessage = rootCauseMessage;		
	}

	
	public BusinessException(String code, String message, Exception originalException, String rootCauseMessage) {
		super(originalException.toString());
		this.originalException = originalException;
		StringWriter sw = new StringWriter();
		originalException.printStackTrace(new PrintWriter(sw));
		this.stackTrace = sw.toString();
		this.rootCauseMessage = rootCauseMessage;
		this.code = code;
		this.message=message;
	}

	public void printStackTrace() {
		printStackTrace(System.err);
	}

	public void printStackTrace(java.io.PrintStream s) {
		synchronized (s) {
			s.print(getClass().getName() + ": ");
			s.print(this.stackTrace);
		}
	}

	public void printStackTrace(java.io.PrintWriter s) {
		synchronized (s) {
			s.print(getClass().getName() + ": ");
			s.print(this.stackTrace);
		}
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Exception getOriginalException() {
		return originalException;
	}

	public void setOriginalException(Exception originalException) {
		this.originalException = originalException;
	}

	public String getRootCauseMessage() {
		return rootCauseMessage;
	}

	public void setRootCauseMessage(String rootCauseMessage) {
		this.rootCauseMessage = rootCauseMessage;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}

}
