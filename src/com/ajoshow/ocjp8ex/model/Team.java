package com.ajoshow.ocjp8ex.model;

import java.util.Set;

public class Team {
	private String name;
	private Coach coach;
	private Set<Player> players;
	
	public Team(String name, Coach coach, Set<Player> players){
		this.name = name;
		this.coach = coach;
		this.players = players;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Coach getCoach() {
		return coach;
	}
	public void setCoach(Coach coach) {
		this.coach = coach;
	}
	public Set<Player> getPlayers() {
		return players;
	}
	public void setPlayers(Set<Player> players) {
		this.players = players;
	}
	
	
}
