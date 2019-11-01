package com.javalec.java;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		Myinfo myinfo = ctx.getBean("myinfo", Myinfo.class);
		myinfo.getinfo();
		ctx.close();
		
	}

}
