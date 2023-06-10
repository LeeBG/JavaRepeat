package starcraft.buildings;

import starcraft.units.Damage_Type;

public class Building {
	private int hp;		 // 체력
//	private int shield;	 			// 프로토스 실드
//	private int regeneration;		// 저그 체력 재생
	private int mana;	 // 마나
	private int attack;	 // 공격력
	private int armor;	 // 방어력
	private double attack_speed;	// 공격속도
	private boolean ground_attack;	// 지상 공격 가능
	private boolean air_attack;		// 공중 공격 가능
	private boolean can_attack;		// 공격가능
	private boolean can_production; // 생산가능
	private Damage_Type damage_type;	// 데미지 타입
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMana() {
		return mana;
	}
	public void setMana(int mana) {
		this.mana = mana;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getArmor() {
		return armor;
	}
	public void setArmor(int armor) {
		this.armor = armor;
	}
	public double getAttack_speed() {
		return attack_speed;
	}
	public void setAttack_speed(double attack_speed) {
		this.attack_speed = attack_speed;
	}
	public boolean isGround_attack() {
		return ground_attack;
	}
	public void setGround_attack(boolean ground_attack) {
		this.ground_attack = ground_attack;
	}
	public boolean isAir_attack() {
		return air_attack;
	}
	public void setAir_attack(boolean air_attack) {
		this.air_attack = air_attack;
	}
	public boolean isCan_attack() {
		return can_attack;
	}
	public void setCan_attack(boolean can_attack) {
		this.can_attack = can_attack;
	}
	public boolean isCan_production() {
		return can_production;
	}
	public void setCan_production(boolean can_production) {
		this.can_production = can_production;
	}
	public Damage_Type getDamage_type() {
		return damage_type;
	}
	public void setDamage_type(Damage_Type damage_type) {
		this.damage_type = damage_type;
	}
	
	
	
}
