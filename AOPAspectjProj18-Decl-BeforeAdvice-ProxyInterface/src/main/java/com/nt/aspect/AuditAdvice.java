package com.nt.aspect;

import java.io.FileWriter;
import java.util.Arrays;
import java.util.Date;

import org.aspectj.lang.JoinPoint;

public class AuditAdvice {
	
	/*public void auditing(JoinPoint jp)throws Throwable{
		String auditMsg=null;
		Object args[]=null;
		FileWriter writer=null;
		System.out.println("tagert method details"+jp.getSignature()+" args"+Arrays.toString(jp.getArgs()));
		args=jp.getArgs();
		args[0]=(Integer)args[0]+10;
		//prepare Auditing message
		auditMsg=args[0]+" Loan Id Loan has for come approval on date::"+new Date()+" Loan type is::"+args[1];
		//write messages to audit log file..
		writer=new FileWriter("e:\\auditLog.txt");
		writer.write(auditMsg);
		writer.flush();
		writer.close();
	}//auditing(-)
*/
	public void auditing(int lid,String loanType)throws Throwable{
		String auditMsg=null;
		FileWriter writer=null;
		//System.out.println("tagert method details"+jp.getSignature()+" args"+Arrays.toString(jp.getArgs()));
		//prepare Auditing message
		auditMsg=lid+" Loan Id Loan has for come approval on date::"+new Date()+" Loan type is::"+loanType;
		//write messages to audit log file..
		writer=new FileWriter("e:\\auditLog.txt");
		writer.write(auditMsg);
		writer.flush();
		writer.close();
	}//auditing(-)

	}//class
