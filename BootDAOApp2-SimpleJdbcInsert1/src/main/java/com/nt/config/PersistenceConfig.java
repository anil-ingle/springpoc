package com.nt.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

@Configuration
@ComponentScan(basePackages="com.nt.dao")
public class PersistenceConfig {
	@Autowired
	private DataSource ds;
	
/*	@Value("${my.driver}")
	private String driver;
	@Value("${my.url}")
	private String url;
	@Value("${my.username}")
	private String username;
	@Value("${my.password}")
	private String password;
	*/
	
/*	@Bean
	public DataSource createDataSource(){
		BasicDataSource ds=null; 
		ds=new BasicDataSource();
		ds.setDriverClassName(driver);
		ds.setUrl(url);
		ds.setUsername(username);
		ds.setPassword(password);
		return ds;
	}*/
	
	@Bean
	public SimpleJdbcInsert createSimpleJdbcInsert(){
		return new SimpleJdbcInsert(ds);
	}

}
