package com.nt.beans;


import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;

@Named("db")
public class DBOperations{
  @Value("${jdbc.driver}")
  private String driver;
  @Value("${jdbc.url}")
  private String url;
  @Value("${jdbc.user}")
  private String user;
  @Value("${jdbc.pwd}")
  private String pwd;
 @Value("${java.vm.vendor}")
  private String vendor;

   public  String  makeConnection(){
      return "driver:"+driver+"url="+url+"user="+user+" pwd="+pwd+" vendor="+vendor;
     }
}