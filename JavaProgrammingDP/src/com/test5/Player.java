package com.test5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*	consider list of T20 players (IPL)
 * Player(playerid, name, country, team)
 * find out which team has maximum Austrian players
 */
public class Player {
	private int pno;
	private String pname;
	private String country;
	private String team;

	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(int pno, String pname, String country, String team) {
		super();
		this.pno = pno;
		this.pname = pname;
		this.country = country;
		this.team = team;
	}

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public static int calculateCount(ArrayList<String> a) {
		int max = 0;
		for (int i = 0; i < a.size(); i++) {
			int count = 0;
			for (int j = i + 1; j < a.size(); j++) {
				if (a.get(i).equals(a.get(j))) {
					count++;
					if (count > max)
						max = count;
				}
			}
		}
		return max;
	}

	@Override
	public String toString() {
		return "player [pno=" + pno + ", pname=" + pname + ", country=" + country + ", team=" + team + "]";
	}

	public static void main(String[] args) {
		Player p1 = new Player(1, "MS Dhoni", "India", "CSK");
		Player p2 = new Player(2, "Virat", "India", "RCB");
		Player p3 = new Player(3, "Maxwell", "Austrila", "RCB");
		Player p4 = new Player(4, "Warner", "Austrila", "CSK");
		Player p5 = new Player(5, "Pollard", "WI", "MI");
		Player p6 = new Player(3, "Stark", "Austrila", "CSK");
		Player p7 = new Player(4, "Tim David", "Austrila", "MI");
		Player p8 = new Player(4, "Warner", "Austrila", "CSK");
		Player p9 = new Player(4, "Tim David", "Austrila", "MI");
		Player p10 = new Player(4, "Tim David", "Austrila", "MI");

		List<Player> list = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);

		ArrayList<Player> al = new ArrayList(list);

		ArrayList<String> a2 = new ArrayList<>();
		for (Player p : al) {
			if (p.getCountry().equals("Austrila")) {
				a2.add(p.getTeam());
			}
		}
		System.out.println(a2);

		int max = calculateCount(a2);
		String team = null;
		for (int i = 0; i < a2.size(); i++) {
			int count = 0;
			for (int j = i + 1; j < a2.size(); j++) {
				if (a2.get(i).equals(a2.get(j))) {
					count++;
					if (count == max) {
						team = a2.get(i);
						System.out.println(
								"team " + team + "---------> has maximum Austrian players of count " + (max + 1));

					}
				}
			}
		}
	}
}
