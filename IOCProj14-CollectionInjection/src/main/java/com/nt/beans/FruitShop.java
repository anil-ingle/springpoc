package com.nt.beans;

import java.util.Properties;

public class FruitShop {
	
	private Properties fruitColors;

	 public void  setFruitColors(Properties fruitColors){
	     this.fruitColors=fruitColors;
	   }
	 
	 @Override
		public String toString() {
			return "FruitShop [fruitColors=" + fruitColors + "]";
		}

	
}
