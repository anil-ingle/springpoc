package com.nt.aspect;

import java.io.IOException;
import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.SimpleLayout;

public class LogAroundAdvice implements MethodInterceptor {
	private static Logger logger=null;
	
	static{
		logger=Logger.getLogger(LogAroundAdvice.class);
		PropertyConfigurator.configure("src/main/java/com/nt/commons/log4j.properties");
	/*	Appender appender=null;
		Layout layout=null;
		//create Logger object
		logger=Logger.getLogger(LogAroundAdvice.class);
		//create Layout
		layout=new HTMLLayout();
		//create Appender
		try {
			appender=new FileAppender(layout,"mylogs.html");
		} catch (IOException e) {
			e.printStackTrace();
		}
		//add Appender to Logger
		logger.addAppender(appender);*/
		
	}//static
	
	
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
        Object retVal=null;
        Object args[]=null;
        logger.debug("Entering into: "+invocation.getMethod().getName()+" with args"+Arrays.toString(invocation.getArguments()));
        args=invocation.getArguments();
         //moditying arg values        
        if(((Float)args[0])<50000){
        	args[2]=((Float)args[2])-0.50f;
        }
        //skip target method execution for invalid inputs
        if(((Float)args[0])<=0 || ((Float)args[1])<=0 || ((Float)args[2])<=0){
            logger.error("Invalid input while calling: "+invocation.getMethod().getName()+" with args"+Arrays.toString(invocation.getArguments()));
        }
        else{
          retVal=invocation.proceed();
        }
        logger.debug("Leaving from: "+invocation.getMethod().getName()+" with args"+Arrays.toString(invocation.getArguments()));
        //modifying return value
        retVal=((Float)retVal)+(((Float)retVal)*0.18f);
		return retVal;
	}//method
}//class
