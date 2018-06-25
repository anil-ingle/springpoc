package com.nt.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.atomikos.jdbc.AtomikosDataSourceBean;

@Configuration
@ComponentScan(basePackages="com.nt.dao")
public class PersistenceConfig {
	
	@Bean(name="oraXADs")
	public DataSource createXADataSourceForOracle(){
	   AtomikosDataSourceBean atmDs=null;
	   Properties props=null;
	   
	   atmDs=new AtomikosDataSourceBean();
	   atmDs.setUniqueResourceName("OraXA");
	   atmDs.setXaDataSourceClassName("oracle.jdbc.xa.client.OracleXADataSource");
	   props=new Properties();
	   props.put("databaseName","xe");
	   props.put("user", "system");
	   props.put("password", "manager");
	   props.put("URL","jdbc:oracle:thin:@localhost:1521:xe");
	   atmDs.setXaProperties(props);
	   atmDs.setPoolSize(10);
	   return atmDs;
   }
	
	@Bean(name="mysqlXADs")
	public DataSource createXADataSourceForMySql(){
	   AtomikosDataSourceBean atmDs=null;
	   Properties props=null;
	   
	   atmDs=new AtomikosDataSourceBean();
	   atmDs.setUniqueResourceName("MysqlXA");
	   atmDs.setXaDataSourceClassName("com.mysql.jdbc.jdbc2.optional.MysqlXADataSource");
	   props=new Properties();
	   props.put("databaseName","ntsp86DB");
	   props.put("user", "root");
	   props.put("password", "root");
	   props.put("URL","jdbc:mysql:///ntsp86DB");
	   atmDs.setXaProperties(props);
	   atmDs.setPoolSize(10);
	   return atmDs;
   }
	
	@Bean(name="oraJt")
	public  JdbcTemplate createJdbcTemplateForOracle(){
		return new JdbcTemplate(createXADataSourceForOracle());
	}
	
	@Bean(name="mysqlJt")
	public  JdbcTemplate createJdbcTemplateForMysql(){
		return new JdbcTemplate(createXADataSourceForMySql());
	}
}
