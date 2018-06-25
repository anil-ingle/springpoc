package com.nt.config;

import javax.transaction.UserTransaction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.jta.JtaTransactionManager;

import com.atomikos.icatch.jta.UserTransactionImp;
import com.atomikos.icatch.jta.UserTransactionManager;

@Configuration
@EnableTransactionManagement
public class AopConfig {

	@Bean(name="atmUT")
	public UserTransaction createATMUserTransaction(){
		return  new UserTransactionImp();
	}
	
	@Bean(name="atmUTxMgmr")
	public UserTransactionManager createATMUserTransactionManager(){
		return  new UserTransactionManager();
	}
	
	@Bean(name="dTxMgmr")
	public JtaTransactionManager createJtaTxManager(){
		return new JtaTransactionManager(createATMUserTransaction(),createATMUserTransactionManager());
	}
	
}//class
