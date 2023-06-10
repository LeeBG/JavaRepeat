package starcraft.units.protoss;

import starcraft.units.Damage_Type;
import starcraft.units.UnitType;

public class Zealot extends ProtossUnit{
	
	public Zealot(int shield_regeneration) {
		super(shield_regeneration);
		this.setAttack(16);
		this.setSpeed(1.875);
		this.setArmor(1);
		this.setName("질럿");
		this.setHp(100.0);
		this.setShield(60.0);
		this.setShield_regeneration(1);
		this.setPeople(2);
		this.setUnitType(UnitType.Small);
		this.setDamage_type(Damage_Type.Normal);
	}
}
