package com.nt.aspect;

import java.io.FileWriter;
import java.lang.reflect.Method;
import java.util.Date;

import org.springframework.aop.MethodBeforeAdvice;

public class LoanAuditAdvice implements MethodBeforeAdvice {

 @Override
 public void before(Method method, Object[] args, Object target) throws Throwable {
     FileWriter writer=null;
     
     //create FileInputStream pointing to AuditLog file
     writer=new FileWriter("E:/AuditLog.txt",true);
     
     //changing target method args
     if(((Integer)args[0])<0){
    	 args[0]=((Integer)args[0])*-1;
     }
     
     //Stopping the control going to Target class by throwing Exception
     if(((Integer)args[0])==0)
    	 throw new IllegalArgumentException("invalid inputs");

     //write messages to Audit Log file
     writer.write("\n"+args[0]+" has come for"+args[2]+
    		      " loan approval to the manager-->"+args[1]+"at "+new Date());
      writer.flush();
      writer.close();
 }//method
}//class
