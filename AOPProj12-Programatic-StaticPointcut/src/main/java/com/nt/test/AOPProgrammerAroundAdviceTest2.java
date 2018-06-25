package com.nt.test;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.NameMatchMethodPointcutAdvisor;

import com.nt.aspect.PerformanceMonitoringAdvice;
import com.nt.service.ArithmeticOperations;

public class AOPProgrammerAroundAdviceTest2 {

	public static void main(String[] args) {
		ArithmeticOperations operations=null,proxy=null;
		PerformanceMonitoringAdvice pmAdvice=null;
		ProxyFactory factory=null;
		NameMatchMethodPointcutAdvisor pmAdvisor=null;
		
		 //create Target class object
		operations=new ArithmeticOperations();
		//create Advice class object
		pmAdvice=new PerformanceMonitoringAdvice();
		//create Advisor with Pointcut behaviour
		pmAdvisor=new NameMatchMethodPointcutAdvisor();
		pmAdvisor.setMappedNames("sub","mul");
		pmAdvisor.setAdvice(pmAdvice);
		//Set target , Advice to ProxyFactory
		factory=new ProxyFactory();
		factory.setTarget(operations);
		factory.addAdvisor(pmAdvisor);
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
