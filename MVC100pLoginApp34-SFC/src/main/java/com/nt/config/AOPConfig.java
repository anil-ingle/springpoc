package com.nt.config;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class AOPConfig {
	@Resource
	private DataSource ds;
	
	@Bean(name="dsTxMgmr")
	public PlatformTransactionManager createTxMgmr(){
		return new DataSourceTransactionManager(ds);
	}
	

}
