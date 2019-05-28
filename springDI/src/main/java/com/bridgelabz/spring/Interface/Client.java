package com.bridgelabz.spring.Interface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans3.xml");
		MobileShop mobile=context.getBean("mobileshop",MobileShop.class);
		mobile.test();
	}

}
