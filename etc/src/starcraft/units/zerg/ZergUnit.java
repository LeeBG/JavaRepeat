package starcraft.units.zerg;

import starcraft.units.Unit;

public class ZergUnit extends Unit{
	private int hp_regeneration;		// 저그 체력 재생
	
	public ZergUnit(int hp_regeneration) {
		this.hp_regeneration = hp_regeneration;
	}

	public int getHp_regeneration() {
		return hp_regeneration;
	}

	public void setHp_regeneration(int hp_regeneration) {
		this.hp_regeneration = hp_regeneration;
	}
	
	
}
