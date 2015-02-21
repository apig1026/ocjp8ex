package com.ajoshow.ocjp8ex.utils;

import java.text.DecimalFormat;

public class DataFactory {
	public static final int TOTAL_PLAYERS = 1000;
	public static final int TOTAL_COACHS = 100;
	public static final int TOTAL_TEAM_MEMEBERS = 10;
	public static final int TOTAL_TOURNAMENT = 30;

	public static void genPlayerData() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < TOTAL_PLAYERS; i++) {
			String name = names[randomInt(names.length)];
			sb.append(name).append(",");

			int age = randomInt(30) + 10;
			sb.append(age).append(",");

			String nationality = countries[randomInt(countries.length)];
			sb.append(nationality).append(",");

			int stamina = randomInt(50) + 51;
			sb.append(stamina).append(",");

			int skillPoint = randomInt(70) + 31;
			sb.append(skillPoint).append("\n");
		}
		System.out.println(sb.toString());
	}

	public static void genCoachData() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < TOTAL_COACHS; i++) {
			String name = names[randomInt(names.length)];
			sb.append(name).append(",");

			int age = randomInt(37) + 28;
			sb.append(age).append(",");

			String nationality = countries[randomInt(countries.length)];
			sb.append(nationality).append(",");

			boolean qualified = randomBool();
			sb.append(qualified).append("\n");
		}
		System.out.println(sb.toString());
	}

	public static void genTournamentData() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < TOTAL_TOURNAMENT; i++) {
			String name = "Tournament#" + i;
			sb.append(name).append(",");

			String country = countries[randomInt(countries.length)];
			sb.append(country).append(",");

			DecimalFormat df = new DecimalFormat("########.00");
			String price = df.format((Math.random() + 1) * 100000);
			sb.append(price).append(",");

			int totalTeam = TOTAL_PLAYERS / TOTAL_TEAM_MEMEBERS;
			int halfTotalTeam = totalTeam / 2;

			int fromIndex = randomInt(halfTotalTeam);
			sb.append(fromIndex).append(",");

			int toIndex = fromIndex + randomInt(halfTotalTeam);
			sb.append(toIndex).append("\n");
		}
		System.out.println(sb.toString());
	}

	public static void genTeamData() {
		StringBuilder sb = new StringBuilder();
		int totalTeams = TOTAL_PLAYERS / TOTAL_TEAM_MEMEBERS;
		for (int i = 0; i < totalTeams; i++) {
			String name = teams[randomInt(teams.length)];
			sb.append(name).append(",");

			int startIndex = TOTAL_TEAM_MEMEBERS * i;
			sb.append(startIndex).append(",");

			int count = TOTAL_TEAM_MEMEBERS;
			sb.append(count).append(",");

			int coachIndex = Math.min(i, TOTAL_COACHS - 1);
			sb.append(coachIndex).append("\n");
		}
		System.out.println(sb.toString());
	}

	private static int randomInt(int n) {
		return (int) (Math.random() * n);
	}

	private static boolean randomBool() {
		return ((int) (Math.random() * 2) % 2) == 0;
	}

	private static String[] names = { "Arletta Lash", "Helena Notter",
			"Fatima Whittenberg", "Karine Slemp", "Leola Lawler",
			"Madelyn Brookshire", "Jennie Wilbur", "Earleen Twyman",
			"Ollie Lastrapes", "Lizzie Middendorf", "Joesph Pasquariello",
			"Kasi Burford", "Tempie Scharff", "Ludie Christofferse",
			"Lanell Juan", "Flavia Childs", "Jannette Ashcroft",
			"Rosamaria Espy", "Kenyetta Longnecker", "Neil Kreps",
			"Tressie Steib", "Chase Siders", "Dee Zook", "Ping Pickert",
			"Sherrie Wayland", "Fran Gamon", "Margert Rideout", "Nedra Brien",
			"Christal Stenger", "Hosea Radabaugh", "Kermit Sobotka",
			"Rosanna Holzer", "Precious Stitt", "Malena Albertson",
			"Bari Kowal", "Ina Chesnut", "Pandora Veliz", "Mozella Ganey",
			"Rex Bisignano", "Melonie Elmore", "Shantelle Juarbe",
			"Lilliam Blankenbaker", "Lesia Gragg", "Zetta Leary",
			"Herma Liebel", "Loan Gautreau", "Rosaline Varona",
			"Filomena Conely", "Kera Zych", "Lia Migues", "Andy Chu",
			"Kirin Chen", "Joe Chou" };
	private static String[] countries = { "Afghanistan", "Albania", "Algeria",
			"Andorra", "Angola", "Antigua and Barbuda", "Argentina", "Armenia",
			"Aruba", "Australia", "Austria", "Azerbaijan", "Bahrain",
			"Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin",
			"Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana",
			"Brazil", "Brunei ", "Bulgaria", "Burkina Faso", "Burma",
			"Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde",
			"Central African Republic", "Chad", "Chile", "China", "Colombia",
			"Comoros", "Cuba", "Curacao", "Cyprus", "Czech Republic",
			"Denmark", "Djibouti", "Ecuador", "Egypt", "El Salvador",
			"Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Fiji",
			"Finland", "France", "Gabon", "Georgia", "Germany", "Ghana",
			"Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau",
			"Guyana", "Haiti", "Honduras", "Hong Kong", "Hungary", "Iceland",
			"India", "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy",
			"Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati",
			"Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon",
			"Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania",
			"Luxembourg", "Macau", "Macedonia", "Madagascar", "Malawi",
			"Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands",
			"Mauritania", "Mauritius", "Mexico", "Micronesia", "Moldova",
			"Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique",
			"Namibia", "Nauru", "Nepal", "Netherlands", "Netherlands Antilles",
			"New Zealand", "Nicaragua", "Niger", "Nigeria", "North Korea",
			"Norway", "Oman", "Pakistan", "Palau", "Palestinian Territories",
			"Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines",
			"Poland", "Portugal", "Qatar", "Romania", "Russia", "Rwanda",
			"Saint Kitts and Nevis", "Saint Lucia", "Samoa ", "San Marino",
			"Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone",
			"Singapore", "Sint Maarten", "Slovakia", "Slovenia",
			"Solomon Islands", "Somalia", "South Africa", "South Korea",
			"South Sudan", "Spain ", "Sri Lanka", "Sudan", "Suriname",
			"Swaziland ", "Sweden", "Switzerland", "Syria", "Taiwan",
			"Tajikistan", "Tanzania", "Thailand ", "Timor-Leste", "Togo",
			"Tonga", "Trinidad and Tobago", "Tunisia", "Turkey",
			"Turkmenistan", "Tuvalu", "Uganda", "Ukraine",
			"United Arab Emirates", "United Kingdom", "Uruguay", "Uzbekistan",
			"Vanuatu", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe" };
	private static String[] teams = { "AQUA NETS", "ARMY MEN", "ARSENAL",
			"ARSENALS ", "ASH KICKERS", "ATLAS", "ATOMIC FIREBALLS",
			"ATOMIC ICE", "ATOMS", "AVALANCHE", "AVENGERS", "BABES N’ BLUE",
			"BABES ON FIELD", "BACK STREET GIRLS", "BACTI-GROW", "BAD BOYS",
			"BAD GIRLS", "BAD GIRLZ", "FLOWER POWER", "FLYERS",
			"FLYING DRAGONS", "FORTY-NINERS", "FORCE ", "FRAZZLE DAZZLE",
			"FROGS", "FUGITIVES", "FULL FORCE", "MACHINE", "MEAN GREEN GECKOS",
			"MEN IN BLUE", "MENEHUNES", "MERCENARIES", "MERCURY",
			"MIDNIGHT EXPRESS", "SILVER HAWKS", "SILVER JETS",
			"SILVER KNIGHTS", "SILVER LIGHTNING", "SILVER PANTHERS",
			"SILVER SHARKS", "ILVER SLICK CHICKS", "NALAS", "NAVY SEALS",
			"NET STUFFERS", "NET SURFERS", "NIGHTHAWKS", "NIGHTMARE", "NINJAS",
			"NITEMARES", "GREEN DEVILS", "GREEN DOLPHINS", "GREEN DRAGON",
			"GREEN DRAGONS", "GREEN ELIMINATORS", "GREEN EXTREME",
			"GREEN FROGS", "GREEN GALAXY", "GREEN GATORS",
			"BLUE MOUNTAIN KICKER KIDS", "BLUE PANTHERS 2000", "BLUE POWER",
			"BLUE RAGE", "BLUE RAZORS", "BLUE ROBINS", "BLUE ROCKETS",
			"BLUE RUBIES", "BLUE SCORPIONS", "BLUE SHARKS", "POWER PUFFS",
			"POWER PUFFS", "POWER PUNKS", "POWERFUFF GIRLS", "POWERFUL PANDAS",
			"TEEIE WAHINES", "TEH DRAGONS", "TERMINATORS", "TERMITES", "HUNS",
			"HURRICANE", "HURRICANE RUSH", "HURRICANES", "HYPERACTIVE",
			"HYPERGIRLS", "VENOM", "VIKINGS", "WOLF PACK", "WOLVERINES ",
			"KAOS", "KICKER INSTINCT", "KICKIN CHICS", "KICKIN KIWIS",
			"COOL CHICKS WITH POWER KICKS", "COOL CRUISERS", "RED STRIKERS",
			"RED TAIL HAWKS", "LIME TWISTS", "LIONS", "LITTLE FOOTS",
			"LITTLE GIANTS", "DEVILS" };
}
