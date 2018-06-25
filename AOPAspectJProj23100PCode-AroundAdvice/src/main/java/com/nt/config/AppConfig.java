package com.nt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value={AOPConfig.class,ServiceConfig.class})
public class AppConfig {

}
