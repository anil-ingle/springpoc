package com.nt.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.jndi.JndiObjectFactoryBean;

@Configuration
@ComponentScan(basePackages="com.nt.dao")
public class PersistenceConfigurator {
	
	@Bean
	public  DataSource  getDataSource(){
		JndiDataSourceLookup jdsl;
		DataSource ds=null;

		jdsl=new JndiDataSourceLookup();
		ds=(DataSource)jdsl.getDataSource("java:/comp/env/DsJndi");
		return ds;
	}//method
	
	@Bean
	public JdbcTemplate  createJdbcTemplate(){
		JdbcTemplate jt=null;
		jt=new JdbcTemplate();
		jt.setDataSource(getDataSource());
		return jt;
	}//method
}//class
