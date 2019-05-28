package com.bridgelabz.spring.qualifier;

public class Play 
{
	private int balls;
	private String game;

	public int getBalls() {
		return balls;
	}

	public void setBalls(int balls) {
		this.balls = balls;
	}

	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}

	public void playGame() {

		System.out.println("I am playing..");

	}
	
}
