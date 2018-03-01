/**
 * JwtAuthenticationResponse.java
 * Modification log:
 * Date 		Author				Description
 * Sep 26, 2016	binu.kc	Created JwtAuthenticationResponse
 */
package com.affinity.awas.security.service;

import java.io.Serializable;


public class JwtAuthenticationResponse implements Serializable {

    private static final long serialVersionUID = 1250166508152483573L;

    
    private int code;
    private String message;
    private Object result;
    private String token;
    
    public JwtAuthenticationResponse(){
    	
    }
    public JwtAuthenticationResponse(String token) {
        this.token = token;
    }
    
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getResult() {
		return result;
	}
	public void setResult(Object result) {
		this.result = result;
	}
	
    
    
}
