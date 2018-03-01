/**
 * JwtUser.java
 * Modification log:
 * Date 		Author				Description
 * Sep 26, 2016	binu.kc	Created JwtUser
 */
package com.affinity.awas.security.service;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.affinity.awas.security.entity.User;


public class JwtUser implements UserDetails {

   	private static final long serialVersionUID = -3431684729631608925L;
	
   	private final User user;
    private final Collection<? extends GrantedAuthority> authorities;
    private final boolean enabled;
    

    public JwtUser(
          User user,
          Collection<? extends GrantedAuthority> authorities,
          boolean enabled    
    ) {
        this.user= user;
        this.authorities = authorities;
        this.enabled = enabled;
    
    }

    

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    public User getUser() {
		return user;
	}



	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return user.getPassword();
	}



	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return user.getUserName();
	}



	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}



	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}



	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
    
    

    }
