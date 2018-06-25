package com.nt.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.nt.domain.EmployeeHLO;

@Configuration
@ComponentScan(basePackages="com.nt.dao")
public class PersistenceConfig {
	
	@Bean(name="dbcpds")
	public DataSource createDataSource(){
		BasicDataSource cpds=null;
		cpds=new BasicDataSource();
		cpds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		cpds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		cpds.setUsername("system");
		cpds.setPassword("manager");
		return cpds;
	}//method
	
	@Bean(name="localSesFact")
	public LocalSessionFactoryBean createLocalSessionFactoryBean(){
		
		LocalSessionFactoryBean bean=null;
		Properties props=null;
		
		bean=new LocalSessionFactoryBean();
		bean.setAnnotatedClasses(EmployeeHLO.class);
		bean.setDataSource(createDataSource());
		
		props=new Properties();
		props.put("hibernate.show_sql","true");
		props.put("hibernate.format_sql","true");
		props.put("hibernate.dialect","org.hibernate.dialect.Oracle10gDialect");
		bean.setHibernateProperties(props);
		return bean;
		
	}
	@Bean(name="sesfact")
	public SessionFactory  createSessionFactory(){
		return createLocalSessionFactoryBean().getObject();
	}
	
	@Bean("ht")
	public HibernateTemplate createHibernateTemplate(){
		return new HibernateTemplate(createSessionFactory());
	}
}//class
