package com.nt.config;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class AOPConfig {
	
	@Autowired
	@Qualifier("sesfact")
	private  SessionFactory factory;
	
	@Bean("hbTxMgmr")
	public HibernateTransactionManager  createHBTxMgmr(){
		return new HibernateTransactionManager(factory);
	}

}
