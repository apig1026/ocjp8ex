package com.ajoshow.ocjp8ex.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ajoshow.ocjp8ex.model.Coach;
import com.ajoshow.ocjp8ex.model.Player;
import com.ajoshow.ocjp8ex.model.Team;
import com.ajoshow.ocjp8ex.model.Tournament;
import com.ajoshow.ocjp8ex.utils.DataFactory;
import com.ajoshow.ocjp8ex.utils.DataReader;

public abstract class BaseTest {

	protected List<Player> players;
	protected List<Coach> coachs;
	protected List<Team> teams;
	protected List<Tournament> tournaments;

	/**
	 * Uses normal java way to implement the question.
	 * 
	 * @return whatever result output by this method.
	 */
	public abstract Object withJava();

	/**
	 * Uses java 8 way to implement the question.
	 * 
	 * @param expectedResult
	 *            The result from {@link #withJava()}. The result produced by
	 *            this method should be the same as this value.
	 */
	public abstract void withJava8(Object expectedResult);
	
	/**
	 * Initialization
	 */
	public void init(){}
	
	public List<Player> getPlayers(){
		List<Player> ps = new ArrayList<Player>();
		for(Player p : players){
			ps.add(p);
		}
		return ps;
	}

	@Test
	public void testExercise() {
		init();
		withJava8(withJava());
	}

	@Before
	public void setup() {
		players = DataReader.readPlayerData();
		coachs = DataReader.readCoachData();
		teams = DataReader.readTeamData(players, coachs);
		tournaments = DataReader.readTournamentData(teams);
	}

	@Test
	public void testReadDataCorrectly() {
		assertEquals(DataFactory.TOTAL_PLAYERS, players.size());
		assertEquals(DataFactory.TOTAL_COACHS, coachs.size());
		assertEquals(DataFactory.TOTAL_PLAYERS
				/ DataFactory.TOTAL_TEAM_MEMEBERS, teams.size());
		assertEquals(DataFactory.TOTAL_TOURNAMENT, tournaments.size());
	}
}
