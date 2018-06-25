package com.nt.I18n;

import java.awt.FlowLayout;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIApp{

	public static void main(String[] args) {
		Locale locale=null;
		ResourceBundle rb=null;
		String l1=null,l2=null,l3=null,l4=null;
		JButton btn1=null,btn2=null,btn3=null,btn4=null;
		JFrame frame=null;
		
		//create Locale object
		locale=new Locale(args[0],args[1]);
		//Pick Up the properties file using ResourceBundle
		rb=ResourceBundle.getBundle("com/nt/commons/App",locale);
		//get Messages (labels)
		l1=rb.getString("cap1");
		l2=rb.getString("cap2");
		l3=rb.getString("cap3");
		l4=rb.getString("cap4");
		//create Buttons
		btn1=new JButton(l1);
		btn2=new JButton(l2);
		btn3=new JButton(l3);
		btn4=new JButton(l4);
		//create Frame and add components
		frame=new JFrame();
		frame.add(btn1); frame.add(btn2);
		frame.add(btn3); frame.add(btn4);
		frame.setLayout(new FlowLayout());
		frame.pack();
		frame.setVisible(true);
	}//main
}//class
