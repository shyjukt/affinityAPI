/**
 * LoggingAspect.java
 * Modification log:
 * Date 		Author				Description
 * Aug 22, 2016	binu.kc	Created LoggingAspect.java
 */
package com.affinity.awas.support;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author binu.kc
 *
 */
@Component
@Aspect
public class LoggingAspect {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Before("execution(* com.affinity.awas.*..*(..))")
	public void logBefore(JoinPoint joinPoint) {
		logger.info("Invoking method " + joinPoint.getSignature());
		logger.debug("With args : " + Arrays.toString(joinPoint.getArgs()));
		System.out.println("******");
	}
}
