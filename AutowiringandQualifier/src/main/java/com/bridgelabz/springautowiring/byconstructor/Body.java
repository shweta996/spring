package com.bridgelabz.springautowiring.byconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("byconstructor.xml");
		Human human=context.getBean("human",Human.class);
		human.startPumping();

	}

}
