package com.bridgelabz.spring.annotation;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		
		ApplicationContext context=new AnnotationConfigApplicationContext(CollegeConfig.class);
       College college=context.getBean("collegeBeanAnother",College.class);
       System.out.println("the college object created by spring is: "+college);
       college.test();
	}

}
