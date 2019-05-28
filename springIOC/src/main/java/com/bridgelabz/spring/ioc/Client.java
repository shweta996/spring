package com.bridgelabz.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		 System.out.println("config loaded..");
		Sim sim=context.getBean("sim",Idea.class);
		sim.calling();
		sim.data();
      
	}

}
                                                                                                                                                                                                                                                             