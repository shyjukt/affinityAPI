/**
 * AuthenticationService.java
 * Modification log:
 * Date 		Author				Description
 * Aug 17, 2016	binu.kc	Created AuthenticationService.java
 */
package com.affinity.awas.security.service;

import javax.servlet.http.HttpServletRequest;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.affinity.awas.exception.LoginException;

import com.affinity.awas.security.LoginAttemptService;

import com.affinity.awas.security.entity.User;
import com.affinity.awas.security.repository.UserRepository;


@Service("userDetailsService")
public class AuthenticationService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private LoginAttemptService loginAttemptService;

	@Autowired
	private HttpServletRequest request;

	public AuthenticationService() {
		super();
	}

	@Override
	public UserDetails loadUserByUsername(final String userName) throws UsernameNotFoundException{
		final String ip = getClientIP();
		if (loginAttemptService.isBlocked(ip)) {
			throw new RuntimeException("blocked");
		}

		try {


			final User user = userRepository.findByUserName(userName);

			if (user == null) {
				throw new LoginException(LoginException.BAD_REQUEST,
						"Bad credentials");
			}
			return JwtUserFactory.create(user);
			/*
			 * return new org.springframework.security.core.userdetails.User(
			 * user.getLoginId(), user.getPassword(), user.isActive(), true,
			 * true, true, getAuthorities(user.getRoles()));
			 */
		} catch (Exception e) {

			System.out.println("*** ****** =  EXCEPTION in authentication service"+e.getMessage());
			
			throw new RuntimeException(e.getMessage());
		}

	}
	
	private String getClientIP() {
		final String xfHeader = request.getHeader("X-Forwarded-For");
		if (xfHeader == null) {
			return request.getRemoteAddr();
		}
		return xfHeader.split(",")[0];
	}
}