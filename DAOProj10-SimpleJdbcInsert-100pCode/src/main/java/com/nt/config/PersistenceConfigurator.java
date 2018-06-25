package com.nt.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@ComponentScan(basePackages="com.nt.dao")
@PropertySource(value="classpath:com/nt/commons/jdbc.properties")
public class PersistenceConfigurator {
	@Autowired
	private Environment env;
	
	@Bean(name="cpds")
	public DataSource createDataSource()throws Exception{
		ComboPooledDataSource cpds=null;
		cpds=new ComboPooledDataSource();
		cpds.setDriverClass(env.getRequiredProperty("jdbc.driver"));
		cpds.setJdbcUrl(env.getProperty("jdbc.url"));
		cpds.setUser(env.getProperty("jdbc.username"));
		cpds.setPassword(env.getProperty("jdbc.password"));
		return cpds;
	}
	
	@Bean(name="sjInsert")
	public SimpleJdbcInsert  createSimpleJdbcInsert()throws Exception{
		SimpleJdbcInsert sjInsert=null;
		sjInsert=new SimpleJdbcInsert(createDataSource());
		return sjInsert;
	}

}
