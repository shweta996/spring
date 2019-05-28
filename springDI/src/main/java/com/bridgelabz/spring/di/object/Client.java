package com.bridgelabz.spring.di.object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("beans2.xml");
		System.out.println("config is loaded..");
		Student student=context.getBean("student",Student.class);
		  student.cheating();
		  
		  AnotherStudent anotherstudent=context.getBean("anotherstudent",AnotherStudent.class);
		  anotherstudent.startCheating();
		  
		
	}

}
