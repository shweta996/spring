package com.bridgelabz.spring.ioc;

public class Idea  implements Sim 
{
  public Idea()
  {
	  System.out.println("constructor called..");
  }
	@Override
	public void calling() {
		System.out.println("calling using idea sim..");
		
	}

	@Override
	public void data() {
		System.out.println("browsing internet using idea sim..");
		
	}
	
	

}
