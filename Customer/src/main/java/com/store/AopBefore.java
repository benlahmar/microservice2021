package com.store;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class AopBefore {

	@Before("execution(* com.store.rest.ResrepoAccount.*(..))")
	public void before(JoinPoint jp)
	{
		System.out.println("avant......appel "+jp.getSignature().getName());
		System.out.println(jp.getArgs());
	}
	
	@Before("execution(* com.store.rest.RestAccount.getbyid(..))")
	public void beforeaccs(JoinPoint jp)
	{
		System.out.println("avant......appel "+jp.getSignature().getName());
		System.out.println("le parametre :"+jp.getArgs()[0]);
	}
	
	@After( "execution (* com.store.rest.RestAccount.*(..))")
	public void after(JoinPoint jp)
	{
		
		System.out.println("after......");
	}
	
	@AfterReturning(
			pointcut =  "execution (* com.store.rest.RestAccount.*(..))",
			returning = "res")
	public void retourn(JoinPoint jp, Object res)
	{
		System.out.println("apres retour......"+jp.getSignature().getDeclaringTypeName());
		System.out.println(res);
	}
	
//	@Around( "execution (* com.store.rest.RestAccount.getbyid(..))")
//	public void complet()
//	{
//			System.out.println("au tour.......");
//	}
	
	}

	
