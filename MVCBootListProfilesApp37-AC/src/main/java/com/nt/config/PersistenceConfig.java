package com.nt.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.nt.dao")
public class PersistenceConfig {

	
	@Bean
	public DataSource createDataSource(){
		BasicDataSource ds=null;
		ds=new BasicDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql:///ntsp86db");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	
}
