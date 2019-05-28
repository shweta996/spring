package com.bridgelabz.spring.qualifier;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HumanTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println("before application context");
		ApplicationContext context = new ClassPathXmlApplicationContext("qualifier.xml");
		Human human =context.getBean("human", Human.class);
		human.displayGame();
	}
}