package com.bridgelabz.springautowiring.bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {

	public static void main(String[] args) 
	{
		
		ApplicationContext context=new ClassPathXmlApplicationContext("bytype.xml");
		Human human=context.getBean("human",Human.class);
		human.startPumping();
	
	}

}
