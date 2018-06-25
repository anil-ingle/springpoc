package com.nt.test;

import java.awt.FlowLayout;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringI18nTest {

	public static void main(String[] args) {
		 ApplicationContext ctx=null;
		 String l1=null,l2=null,l3=null,l4=null;
		 Locale locale1=null,locale2=null;
		 JFrame frame=null;
		 JButton btn1=null,btn2=null,btn3=null,btn4=null;
		//create IOC container
		 ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		 //get Messages
		 //locale=new Locale(args[0],args[1]);
		 locale1=new Locale("fr","FR");
		 locale2=new Locale("de","DE");
		 
		 l1=ctx.getMessage("cap1",new Object[]{"me"},"Default Msg1",locale1);
		 System.out.println(ctx.getMessage("cap1",new Object[]{"me"},"Default Msg1",locale2));
		 l2=ctx.getMessage("cap2",null,"Default Msg2",locale1);
		 l3=ctx.getMessage("cap3",null,"Default Msg3",locale1);
		 l4=ctx.getMessage("cap4",null,"Default Msg4",locale1);
		 //create Frame Application.
		 frame=new JFrame();
		 btn1=new JButton(l1);
		 btn2=new JButton(l2);
		 btn3=new JButton(l3);
		 btn4=new JButton(l4);
		 frame.setLayout(new FlowLayout());
		 frame.add(btn1); frame.add(btn2); frame.add(btn3); frame.add(btn4);
		 frame.pack();
		 frame.setVisible(true);
	}//main
}//class
