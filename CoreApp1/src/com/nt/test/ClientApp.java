package com.nt.test;

import java.lang.reflect.Constructor;

public class ClientApp {
  public static void main(String[] args)throws Exception {
	Class c=Class.forName("com.nt.test.Test");
	Constructor cons=c.getDeclaredConstructors()[0];
	cons.setAccessible(true);
	cons.newInstance(null);
}
  
}
