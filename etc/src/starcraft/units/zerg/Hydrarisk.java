package starcraft.units.zerg;

import starcraft.units.Damage_Type;
import starcraft.units.UnitType;

public class Hydrarisk extends ZergUnit{

	public Hydrarisk(int hp_regeneration) {
		super(hp_regeneration);
		this.setHp(80);
		this.setCan_attack(true);
		this.setGround_attack(true);
		this.setAir_unit(false);
		this.setAir_attack(true);
		this.setAttack(10);
		this.setArmor(0);
		this.setAttack_speed(15.0);// 공격속도라고 하지만 사실은 공격주기임
		this.setName("히드라 리스크");
		this.setSpeed(1.741);
		this.setUnitType(UnitType.Medium);
		this.setDamage_type(Damage_Type.Explosive); // 폭발형은 중형에 75%의 데미지를 준다.
	}	
}
