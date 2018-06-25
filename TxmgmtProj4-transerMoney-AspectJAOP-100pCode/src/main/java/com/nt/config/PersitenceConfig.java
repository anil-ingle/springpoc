package com.nt.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan(basePackages="com.nt.dao")
public class PersitenceConfig {
	
	@Bean(name="dbcp")
	public DataSource createDataSource(){
		BasicDataSource ds=null;
		ds=new BasicDataSource();
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		ds.setUsername("system");
		ds.setPassword("manager");
		ds.setInitialSize(10);
		ds.setMaxTotal(100);
		return ds;
	}

	@Bean(name="template")
	public JdbcTemplate createJdbcTemplate(){
		return new JdbcTemplate(createDataSource());
	}
	

}
