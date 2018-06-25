package com.nt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value={PersistenceConfigurator.class,ServiceConfigurator.class})
public class BeanConfigurator {

}
