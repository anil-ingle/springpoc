package com.nt.test;

import org.springframework.aop.framework.ProxyFactory;

import com.nt.aspect.PerformanceMonitoringAdvice;
import com.nt.service.ArithmeticOperations;

public class AOPProgrammerAroundAdviceTest {

	public static void main(String[] args) {
		ArithmeticOperations operations=null,proxy=null;
		PerformanceMonitoringAdvice advice=null;
		ProxyFactory factory=null;
		 //create Target class object
		operations=new ArithmeticOperations();
		//create Advice class object
		advice=new PerformanceMonitoringAdvice();
		//Set target , Advice to ProxyFactory
		factory=new ProxyFactory();
		factory.setTarget(operations);
		factory.addAdvice(advice);
		//get Proxy
		proxy=(ArithmeticOperations) factory.getProxy();
		//invoke methods
		System.out.println("Sum::"+proxy.sum(100,200));
		System.out.println("..................................");
		System.out.println("Sub::"+proxy.sub(200,100));
		System.out.println(".................................");
		System.out.println("Mul::"+proxy.mul(200,100));
	}//main
}//class
