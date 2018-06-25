package com.nt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan(basePackages="com.nt.aspect")
@Configuration
@EnableAspectJAutoProxy
public class AopConfig {

}
