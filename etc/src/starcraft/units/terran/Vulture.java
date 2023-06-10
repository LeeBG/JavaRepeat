package starcraft.units.terran;

import starcraft.units.Damage_Type;
import starcraft.units.UnitType;

public class Vulture extends TerranUnit {
	// 벌쳐 스팩
	public Vulture(boolean repairable) {
		super(repairable);
		this.setHp(80.0);
		this.setCan_attack(true);
		this.setGround_attack(true);
		this.setAir_attack(false);
		this.setAttack(20.0);
		this.setArmor(0);
		this.setAttack_speed(30.0);// 공격속도라고 하지만 사실은 공격주기임
		this.setName("벌쳐");
		this.setRepairable(true);
		this.setSpeed(3.126);
		this.setUnitType(UnitType.Medium);
		this.setDamage_type(Damage_Type.Concussive); // 진동형은 중형에 50%의 데미지를 준다.
		this.setAir_unit(false);
	}

}
