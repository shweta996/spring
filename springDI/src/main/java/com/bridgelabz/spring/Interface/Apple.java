package com.bridgelabz.spring.Interface;

public class Apple implements Mobile{

	@Override
	public void getMobile() {
		System.out.println("Apple x10");
	}

	@Override
	public void getPrice() {
		
		System.out.println("Rs :100000");
		
	}

}
