package com.ajoshow.ocjp8ex.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.ajoshow.ocjp8ex.model.Coach;
import com.ajoshow.ocjp8ex.model.Player;
import com.ajoshow.ocjp8ex.model.Team;
import com.ajoshow.ocjp8ex.model.Tournament;

public class DataReader {
	public static List<Player> readPlayerData() {
		List<Player> list = new ArrayList<Player>();
		String line = null;
		try (BufferedReader br = new BufferedReader(new FileReader("players.txt"))) {
			while ((line = br.readLine()) != null) {
				String[] s = line.split(",");
				String name = s[0];
				int age = Integer.parseInt(s[1]);
				String nationality = s[2];
				int stamina = Integer.parseInt(s[3]);
				int skillPoint = Integer.parseInt(s[4]);
				list.add(new Player(name, age, nationality, stamina, skillPoint));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static List<Coach> readCoachData() {
		List<Coach> list = new ArrayList<Coach>();
		String line = null;
		try (BufferedReader br = new BufferedReader(new FileReader("coachs.txt"))) {
			while ((line = br.readLine()) != null) {
				String[] s = line.split(",");
				String name = s[0];
				int age = Integer.parseInt(s[1]);
				String nationality = s[2];
				boolean qualified = Boolean.parseBoolean(s[3]);
				list.add(new Coach(name, age, nationality, qualified));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static List<Team> readTeamData(List<Player> players, List<Coach> coachs) {
		List<Team> list = new ArrayList<Team>();
		String line = null;
		try (BufferedReader br = new BufferedReader(new FileReader("teams.txt"))) {
			while ((line = br.readLine()) != null) {
				String[] s = line.split(",");
				String name = s[0];
				int startIndex = Integer.parseInt(s[1]);
				int count = Integer.parseInt(s[2]);
				int coachIndex = Integer.parseInt(s[3]);
				Set<Player> ps = new HashSet<Player>(players.subList(startIndex, startIndex + count));
				Coach coach = coachs.get(coachIndex);
				list.add(new Team(name, coach, ps));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static List<Tournament> readTournamentData(List<Team> teams) {
		List<Tournament> list = new ArrayList<Tournament>();
		String line = null;
		try (BufferedReader br = new BufferedReader(new FileReader("tournaments.txt"))) {
			while ((line = br.readLine()) != null) {
				String[] s = line.split(",");
				String name = s[0];
				String country = s[1];
				double price = Double.parseDouble(s[2]);
				int fromIndex = Integer.parseInt(s[3]);
				int toIndex = Integer.parseInt(s[4]);
				List<Team> ts = teams.subList(fromIndex, toIndex);
				list.add(new Tournament(name, country, price, ts));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
}
