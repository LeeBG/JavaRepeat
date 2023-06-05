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
	
	public Player(String color, String race, String name) {
		this.color = color;
		this.race = race;
		this.name = name;
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
		
}
