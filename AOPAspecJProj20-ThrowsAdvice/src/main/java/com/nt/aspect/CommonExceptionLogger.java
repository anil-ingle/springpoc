package com.nt.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;

public class CommonExceptionLogger {
	
	public void exceptionLogger(JoinPoint jp,Exception e){
		System.out.println("exception is raised in "+jp.getSignature()+" with args"+Arrays.toString(jp.getArgs())+"and exeception is"+e);
	}

}
