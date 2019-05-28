package com.bridgelabz.spring.di.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("beans1.xml");
		System.out.println("config loaded");
		
		Employee employee=context.getBean("employee",Employee.class);
		employee.employeeDetails();
		
		Employee employee1=context.getBean("employee1",Employee.class);
		employee1.employeeDetails();
		
	}

}
