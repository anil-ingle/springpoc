package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.nt.config.AopConfig;
import com.nt.config.PersistenceConfig;
import com.nt.config.ServiceConfig;
import com.nt.service.TransferMoneyService;


/*@Configuration
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class,
		                     DataSourceTransactionManagerAutoConfiguration.class})
*/
/*@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class})
*/
@SpringBootApplication
@Import(value={AopConfig.class,ServiceConfig.class,PersistenceConfig.class})
public class BootTxMgmt8DistributedTxMgmtApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		TransferMoneyService proxy=null;
		
		ctx=SpringApplication.run(BootTxMgmt8DistributedTxMgmtApplication.class, args);
		
		//get PRoxy Object
		proxy=ctx.getBean("bankService",TransferMoneyService.class);
		try{
		  System.out.println("Moneyt Transffered?::"+proxy.transferMoney(1003, 1002, 1000));
		}
		catch(Exception e){
			System.out.println("Money not tranffered:");
			e.printStackTrace();
		}
	}
}
