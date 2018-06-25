package com.nt.aspect;

import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.Arrays;

import org.springframework.aop.ThrowsAdvice;

public class CommonExceptionLogger implements ThrowsAdvice {
	
/*	public void afterThrowing(Method method,Object args[],Object target,Throwable e){
		System.out.println("5->Exception is raised in "+target.getClass()+" in method"+method.getName()+" with args"+Arrays.toString(args)+" and exception is"+e);
	}*/
	
	public void afterThrowing(Method method,Object args[],Object target,SQLException e){
		System.out.println("4->Exception is raised in "+target.getClass()+" in method"+method.getName()+" with args"+Arrays.toString(args)+" and exception is"+e);
	}
	
	/*public void afterThrowing(Method method,Object args[],Object target,Exception e){
		System.out.println("1->Exception is raised in "+target.getClass()+" in method"+method.getName()+" with args"+Arrays.toString(args)+" and exception is"+e);
	}*/
/*	public void afterThrowing(Exception e){
		System.out.println("2->Exception is"+e);
	}
*/public void afterThrowing(SQLException e){
		System.out.println("3->Exception is"+e);
	}


}
