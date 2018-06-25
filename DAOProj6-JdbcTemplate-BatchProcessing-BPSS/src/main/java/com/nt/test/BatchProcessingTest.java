package com.nt.test;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.dto.PassengerDTO;
import com.nt.service.GroupReservationService;




public class BatchProcessingTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		GroupReservationService service=null;
		Scanner sc=null;
		int size=0;
		String name=null,boardingFrom=null,destination=null;
		int age=0;
		PassengerDTO dto=null;
		List<PassengerDTO> listDTO=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Service class object
		service=ctx.getBean("reservationService",GroupReservationService.class);
		
		//get GroupSize
		sc=new Scanner(System.in);
		System.out.println("group size::");
	    size=sc.nextInt();
	    System.out.println("Boarding From:");
		boardingFrom=sc.next();
		System.out.println("Boarding To:");
		destination=sc.next();
		
	    listDTO=new ArrayList<>();
		for(int i=1;i<=size;++i){
			System.out.println("Enter "+i+"passenger detals");
			System.out.println("Name:");
			name=sc.next();
			System.out.println("Age:");
			age=sc.nextInt();
			//prepre DTO having info
			dto=new PassengerDTO();
			dto.setName(name);dto.setAge(age);dto.setBoardingForm(boardingFrom);dto.setDestination(destination);
			//add DTO to ListDTO
			listDTO.add(dto);
			
		}//for
		//invoke method
		System.out.println(service.groupReservation(listDTO));
		//close coontainer
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
