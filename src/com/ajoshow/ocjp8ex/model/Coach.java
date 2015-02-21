package com.ajoshow.ocjp8ex.model;

public class Coach extends Person{
	private boolean qualified;
	private Training training;
	
	public Coach(String name, int age, String nationality, boolean qualified){
		super(name, age, nationality);
		this.qualified = qualified;
	}
	
	public Training getTraining() {
		return training;
	}

	public void setTraining(Training training) {
		this.training = training;
	}

	public boolean isQualified() {
		return qualified;
	}

	public void setQualified(boolean qualified) {
		this.qualified = qualified;
	}
	
	public void train(Player player){
		training.train(player);
	}
	
}
