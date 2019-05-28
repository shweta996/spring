package com.bridgelabz.springautowiring.byconstructor;

import org.springframework.beans.factory.annotation.Autowired;

public class Human
{
  private Heart heart;
  public Human()
  {
	  System.out.println( "default constructor call..");
  }
//@Autowired
public Human(Heart heart) {
	super();
	this.heart = heart;
}

public void startPumping()
{
	if(heart != null)
	{
	heart.pump();
	}
	else
	{
		System.out.println("you are dead..");
	}
}
  
  
}
