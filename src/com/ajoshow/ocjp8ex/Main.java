package com.ajoshow.ocjp8ex;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ajoshow.ocjp8ex.model.Coach;
import com.ajoshow.ocjp8ex.model.Player;
import com.ajoshow.ocjp8ex.model.Team;
import com.ajoshow.ocjp8ex.model.Tournament;

public class Main {
	
	List<Player> players;
	List<Coach> coachs;
	List<Team> teams;
	List<Tournament> tournaments;
	
	public static void main(String[] args){
//		DataFactory.genPlayerData();
//		DataFactory.genCoachData();
//		DataFactory.genTeamData();
		DataFactory.genTournamentData();
	}
	
	@Before
	public void setup(){
		players = DataReader.readPlayerData();
		coachs = DataReader.readCoachData();
		teams = DataReader.readTeamData(players, coachs);
		tournaments = DataReader.readTournamentData(teams);
	}
	
	@Test
	public void testReadDataCorrectly() {
		assertEquals(DataFactory.TOTAL_PLAYERS, players.size());
		assertEquals(DataFactory.TOTAL_COACHS, coachs.size());
		assertEquals(DataFactory.TOTAL_PLAYERS / DataFactory.TOTAL_TEAM_MEMEBERS, teams.size());
		assertEquals(DataFactory.TOTAL_TOURNAMENT, tournaments.size());
	}
}
