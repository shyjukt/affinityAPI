/**
 * ErrorJson.java
 * Modification log:
 * Date 		Author				Description
 * Aug 17, 2016	binu.kc	Created ErrorJson.java
 */
package com.affinity.awas.support;

import java.util.Map;

/**
 * Class to customise the error message
 * 
 * @author binu.kc
 *
 */
public class ErrorJson {

	public Integer status;
	public String error;
	public String message;

	public String timeStamp;
	public String trace;

	public ErrorJson(int status, Map<String, Object> errorAttributes) {
		this.status = status;
		this.error = (String) errorAttributes.get("error");
		this.message = (String) errorAttributes.get("message");
		this.timeStamp = errorAttributes.get("timestamp").toString();

		this.trace = (String) errorAttributes.get("trace");

	}
}
