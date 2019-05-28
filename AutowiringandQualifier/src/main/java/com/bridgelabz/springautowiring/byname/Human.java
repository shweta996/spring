package com.bridgelabz.springautowiring.byname;

public class Human 
{

	 private Heart heart;

	public void setHeart(Heart heart) 
	{
    System.out.println("setter method call...");
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
			 System.out.println("you are dead..!!1");
		 }
	 }
	 
	 
}
