package com.affinity.awas.controller;

//import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import org.springframework.context.MessageSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.mobile.device.Device;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.affinity.awas.constants.CodeEnum;
import com.affinity.awas.exception.LoginException;
import com.affinity.awas.security.JwtTokenUtil;

import com.affinity.awas.security.service.JwtAuthenticationRequest;
import com.affinity.awas.security.service.JwtAuthenticationResponse;
import com.affinity.awas.security.service.JwtUser;
import com.affinity.awas.support.ResultMapping;

@RestController
public class AuthenticationController {
	@Value("${jwt.header}")
    private String tokenHeader;
 
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private UserDetailsService userDetailsService;
  
    @Autowired
    private MessageSource messageSource;   
  	
    @RequestMapping(value = "${jwt.route.authentication.path}", method = RequestMethod.POST)
    public @ResponseBody JwtAuthenticationResponse createAuthenticationToken(@RequestBody JwtAuthenticationRequest authenticationRequest, Device device) throws LoginException {
     	JwtAuthenticationResponse response = new JwtAuthenticationResponse();
    	try {    		
    		// Perform the security
			final Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(),authenticationRequest.getPassword()));
			SecurityContextHolder.getContext().setAuthentication(authentication);

			// Reload password post-security so we can generate token
			final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());
			final String token = jwtTokenUtil.generateToken(userDetails, device);
			if (userDetails != null) {
				response.setCode(0);
				//response.setMessage(messageSource.getMessage(CodeEnum.LOGIN_SUCCESS.getValue(), null, Locale.ENGLISH));
				response.setToken(token);

			}else{
				response.setCode(1);
				//response.setMessage(messageSource.getMessage(CodeEnum.LOGIN_FAILURE.getValue(), null, Locale.ENGLISH));
			}


			
    	} catch (Exception e) {
			throw new LoginException(e, e.getMessage());
		}	

    	return response;
    }

    @RequestMapping(value = "${jwt.route.authentication.refresh}", method = RequestMethod.GET)
    public ResponseEntity<?> refreshAndGetAuthenticationToken(HttpServletRequest request) {
        String token = request.getHeader(tokenHeader);
        String username = jwtTokenUtil.getUsernameFromToken(token);
        JwtUser user = (JwtUser) userDetailsService.loadUserByUsername(username);

        if (jwtTokenUtil.canTokenBeRefreshed(token, user.getUser().getPasswordLastModified())) {
            String refreshedToken = jwtTokenUtil.refreshToken(token);
            return ResponseEntity.ok(new JwtAuthenticationResponse(refreshedToken));
        } else {
            return ResponseEntity.badRequest().body(null);
        }
    }
    
    @ExceptionHandler(LoginException.class)
	public @ResponseBody ResultMapping handleEncounterException(LoginException lex) {
		ResultMapping decorator = new ResultMapping();
		decorator.setCode(CodeEnum.FATEL_CODE.getLongValue());
		if (lex.getRootCauseMessage() != null) {
			decorator.setMessage(lex.getRootCauseMessage());
		} else {
			decorator.setMessage(lex.getMessage());
		}

		if (lex.getOriginalException() != null) {
			lex.getOriginalException().printStackTrace();
		} else {
			lex.printStackTrace();
		}

		return decorator;
	}
}
