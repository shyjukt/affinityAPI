package com.affinity.awas.support;

import java.io.Serializable;

public class ResultMapping implements Serializable {
	private static final long serialVersionUID = 2054906578788817871L;

	private Long code;
	private String message;
	private Object result;

	public ResultMapping() {

	}

	public void finalize() throws Throwable {

	}

	/**
	 * @return the code
	 */
	public Long getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(Long code) {
		this.code = code;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the result
	 */
	public Object getResult() {
		return result;
	}

	/**
	 * @param result
	 *            the result to set
	 */
	public void setResult(Object result) {
		this.result = result;
	}

}
