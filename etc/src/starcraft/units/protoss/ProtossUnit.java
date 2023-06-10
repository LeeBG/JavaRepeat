package starcraft.units.protoss;

import starcraft.units.Unit;

public class ProtossUnit extends Unit{
	private double shield;	 				// 프로토스 실드
	private int shield_regeneration;  // 실드 회복
	
	public ProtossUnit(int shield_regeneration) {
		super();
		this.shield_regeneration = shield_regeneration;
	}
	
	public double getShield() {
		return shield;
	}
	public void setShield(double shield) {
		this.shield = shield;
	}
	public int getShield_regeneration() {
		return shield_regeneration;
	}
	public void setShield_regeneration(int shield_regeneration) {
		this.shield_regeneration = shield_regeneration;
	}
	
	
}
