package com.bridgelabz.spring.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

		private Play play;

		@Autowired
		@Qualifier("football")
		public void setPlay(Play play) {

			this.play = play;

		}

		public void displayGame() {

			if (play != null) 
			{
				System.out.println("I am playing the game");
				play.playGame();
				System.out
						.println("Name of the game is " + play.getGame() + " and the number of ball is " + play.getBalls());
			} 
			else {
				System.out.println("Nobody is playing..");
			}
		}
	}

