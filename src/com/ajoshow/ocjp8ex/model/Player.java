package com.ajoshow.ocjp8ex.model;

public class Player extends Person implements Play{
	private int stamina; // 0~100
	private int skillPoint;
	private Act act;
	
	public Player(String name, int age, String nationality, int stamina, int skillPoint){
		super(name, age, nationality);
		this.stamina = stamina;
		this.skillPoint = skillPoint;
	}
	
	public Act getPlay() {
		return act;
	}
	public void setPlay(Act act) {
		this.act = act;
	}
	
	@Override
	public void play(){
		stamina = act.perform(stamina);
	}
	
	public int getStamina() {
		return stamina;
	}
	public void setStamina(int stamina) {
		this.stamina = stamina;
	}
	public int getSkillPoint() {
		return skillPoint;
	}
	public void setSkillPoint(int skillPoint) {
		this.skillPoint = skillPoint;
	} 
}
