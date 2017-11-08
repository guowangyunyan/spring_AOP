package com.shsxt.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@EnableAspectJAutoProxy
@Component
public class LogInterceptor {
	@Pointcut("execution(public * com.shsxt.service..*.add(..))")
	public void myMethod() {
	}

	@Before("myMethod()")
	public void before() {
		System.out.println("method before");
	}

	@After(value = "execution(public * com.shsxt.service..*.add(..))")
	public void after() {
		System.out.println("method end");
	}

	@Around("myMethod()")
	public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("method around start");
		pjp.proceed();
		System.out.println("method around end");
	}
}
