package com.affinity.awas.security;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import com.affinity.awas.security.entity.User;
import com.affinity.awas.security.service.JwtUser;

public class LoggedUserUtil {
	public static User getLoggedUser() {
		JwtUser user = null;
		if (SecurityContextHolder.getContext() == null || SecurityContextHolder.getContext().getAuthentication() == null) {
			return null;
		}
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		if (!(auth instanceof AnonymousAuthenticationToken)) {
			user = (JwtUser) auth.getPrincipal();
		}else
			return null;

		return user.getUser();

	}

}
