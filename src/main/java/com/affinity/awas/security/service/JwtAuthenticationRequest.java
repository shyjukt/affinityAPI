/**
 * JwtAuthenticationRequest.java
 * Modification log:
 * Date 		Author				Description
 * Sep 26, 2016	binu.kc	Created JwtAuthenticationRequest
 */
package com.affinity.awas.security.service;

import java.io.Serializable;

public class  JwtAuthenticationRequest implements Serializable {

    private static final long serialVersionUID = -8445943548965154778L;

    private String username;
    private String password;


    public JwtAuthenticationRequest() {
        super();
    }

    public JwtAuthenticationRequest(String username, String password, Long systemId) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
