package com.nt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
 @Import(value={ServiceConfigurator.class,PersistenceConfigurator.class})
public class BeanConfigurator {

}
