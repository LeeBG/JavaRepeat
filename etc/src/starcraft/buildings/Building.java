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
	
}
