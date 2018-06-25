package com.nt.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jta.narayana.DataSourceXAResourceRecoveryHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
public class AOPConfig {
	@Autowired
  private DataSource ds;
	
/*	@Bean(name="dsTxMgmr",autowire=Autowire.BY_TYPE)
	public PlatformTransactionManager createDsTxMgmr(){
		return  new DataSourceTransactionManager();
	}
*/
	@Bean(name="dsTxMgmr")
	public PlatformTransactionManager createDsTxMgmr(){
		return  new DataSourceTransactionManager(ds);
	}
	
}
