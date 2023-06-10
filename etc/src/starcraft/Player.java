package starcraft;

import java.util.ArrayList;
import starcraft.buildings.Building;
import starcraft.units.Unit;

public class Player {
	private String color;
	private String race;
	private String name;
	private int win;
	private int lose;
	private ArrayList<Unit> units;
	private ArrayList<Building> buildings;
	private static int people;
	private static int people_max;
	
	
	public Player(String color, String race, String name) {
		this.color = color;
		this.race = race;
		this.name = name;
		this.units = new ArrayList<Unit>();
		this.buildings = new ArrayList<Building>();
	}
	
	
	public ArrayList<Unit> getUnits() {
		return units;
	}
	public void setUnits(ArrayList<Unit> units) {
		this.units = units;
	}
	public ArrayList<Building> getBuildings() {
		return buildings;
	}
	public void setBuildings(ArrayList<Building> buildings) {
		this.buildings = buildings;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getWin() {
		return win;
	}

	public void setWin(int win) {
		this.win = win;
	}

	public int getLose() {
		return lose;
	}

	public void setLose(int lose) {
		this.lose = lose;
	}

	public static int getPeople() {
		return people;
	}

	public static void setPeople(int people) {
		Player.people = people;
	}

	public static int getPeople_max() {
		return people_max;
	}

	public static void setPeople_max(int people_max) {
		Player.people_max = people_max;
	}
	
}
