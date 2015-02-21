package com.ajoshow.ocjp8ex.model;

import java.util.List;

public class Tournament {
	private String name;
	private String country;
	private double price;
	private List<Team> teams;

	public Tournament(String name, String country, double price,
			List<Team> teams) {
		this.name = name;
		this.country = country;
		this.price = price;
		this.teams = teams;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<Team> getTeams() {
		return teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}
}
