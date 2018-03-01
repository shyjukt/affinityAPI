package com.affinity.awas.security.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.affinity.awas.security.entity.Privilege;
import com.affinity.awas.security.entity.User;

public final class JwtUserFactory {

    private JwtUserFactory() {
    }

    public static JwtUser create(User user) {
    	
    	return new JwtUser(user, mapToGrantedAuthorities(user.getPrivilege()), user.isActive());
    }

    private static List<GrantedAuthority> mapToGrantedAuthorities(List<Privilege> authorities) {
        return authorities.stream()
                .map(authority -> new SimpleGrantedAuthority(authority.getName()))
                .collect(Collectors.toList());
    }
}
