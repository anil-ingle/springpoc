package com.nt.jdbc;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class EmpCount {

	public static void main(String[] args)throws Exception {
	  InputStream is=null;
	  Properties props=null;
	  Statement st=null;
	  ResultSet rs=null;
		//locate properties file
		is=new FileInputStream("src/com/nt/commons/jdbc.properties");
       //load into java.util.Properties class object
		props=new Properties();
		props.load(is);
	   //register driver
		Class.forName(props.getProperty("jdbc.driver"));
		//Establish the connection
		Connection con=DriverManager.getConnection(props.getProperty("jdbc.url"),
				                                   props.getProperty("jdbc.user"),
				                                   props.getProperty("jdbc.pwd"));
		//create Statement object
		st=con.createStatement();
		//send and execute SQL Query
		rs=st.executeQuery("select * from student");
		//process the ResultSet
		while(rs.next()){
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+"  "+rs.getString(3));
		}//while
		
		//close jdbc objs
		rs.close();
		st.close();
		con.close();
	}//main
}//class
