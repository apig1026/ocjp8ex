package com.ajoshow.ocjp8ex.topic6;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.ajoshow.ocjp8ex.model.Team;
import com.ajoshow.ocjp8ex.model.Tournament;
import com.ajoshow.ocjp8ex.test.BaseTest;

public class FlatMapEx extends BaseTest{

	@Override
	public Object withJava() {
		List<String> teamNames = new ArrayList<String>();
		for(Tournament t : tournaments){
			List<Team> teams = t.getTeams();
			if(teams != null){
				for(Team team : teams){
					teamNames.add(team.getName());
				}
			}
		}
		return teamNames;
	}

	@Override
	public void withJava8(Object expectedResult) {
		List<String> teamNames = tournaments.stream()
					.flatMap(t -> t.getTeams().stream())
					.map(team -> team.getName())
					.collect(Collectors.toList());
		assertEquals(expectedResult, teamNames);
	}
}
