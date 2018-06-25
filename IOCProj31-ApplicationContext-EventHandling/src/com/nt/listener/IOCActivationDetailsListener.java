package com.nt.listener;

import java.util.Date;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class IOCActivationDetailsListener implements ApplicationListener {
    private long start,end;
	@Override
	public void onApplicationEvent(ApplicationEvent ae) {
		if(ae.toString().indexOf("Refreshed")!=-1){
		 start=System.currentTimeMillis();
		 System.out.println("IOC container is created at"+new Date());
		}
		else if(ae.toString().indexOf("Closed")!=-1){
		 end=System.currentTimeMillis();
		 System.out.println("IOC container is stopped at"+new Date());
		 System.out.println("IOC container is in running mode for"+(end-start)+" ms.");
		}
		
	}//method
}//class
