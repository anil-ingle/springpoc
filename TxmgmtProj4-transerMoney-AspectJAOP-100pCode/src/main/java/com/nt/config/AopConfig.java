package com.nt.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement  // alternate to <tx:annotation-driven>
public class AopConfig {
	@Autowired
	private DataSource ds;
	
	@Bean(name="dsTxMgmr")
	public DataSourceTransactionManager createDsTxMgmr(){
		return new DataSourceTransactionManager(ds);
	}

}
