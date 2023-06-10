package starcraft.units;

public class Unit {
	private String name;
	private int people; // 인구수
	private double hp; // 체력
//	private int shield;	 // 프로토스 실드
//	private int regeneration;		// 저그 체력 재생
	private int mana; // 마나
	private double attack; // 공격력
	private int armor; // 방어력
	private double speed; // 이동 속도
	private double attack_speed; // 공격속도
	private boolean ground_attack; // 지상 공격 가능
	private boolean air_attack; // 공중 공격 가능
	private boolean can_attack; // 공격가능
	private boolean can_digging; // 일꾼?
	private boolean air_unit; // 공중유닛인가??
	private Damage_Type damage_type; // 데미지 타입
	private UnitType unitType;

	public void attack(Unit enemy) {
		if (this.isCan_attack()) {
			if (enemy.isAir_unit() && this.isAir_attack()) {
				new Thread() {
					public void run() {
						while (enemy.getHp() > 0) {
							try {
								if (getDamage_type().equals(Damage_Type.Concussive)) {
									switch (enemy.getUnitType()) {
									case Large:
										enemy.setHp(enemy.getHp() - (getAttack() * 0.25));
										break;
									case Medium:
										enemy.setHp(enemy.getHp() - (getAttack() * 0.5));
										break;
									case Small:
										enemy.setHp(enemy.getHp() - getAttack());
										break;
									}
								} else if (getDamage_type().equals(Damage_Type.Explosive)) {
									switch (enemy.getUnitType()) {
									case Large:
										enemy.setHp(enemy.getHp() - getAttack());
										break;
									case Medium:
										enemy.setHp(enemy.getHp() - (getAttack() * 0.75));
										break;
									case Small:
										enemy.setHp(enemy.getHp() - (getAttack() * 0.5));
										break;
									}
								} else if (getDamage_type().equals(Damage_Type.Normal)) {
									switch (enemy.getUnitType()) {
									case Large:
										enemy.setHp(enemy.getHp() - getAttack());
										break;
									case Medium:
										enemy.setHp(enemy.getHp() - getAttack());
										break;
									case Small:
										enemy.setHp(enemy.getHp() - getAttack());
										break;
									}
								} else {
									System.out.println("마법유닛");
									return;
								}
								
								Thread.sleep((long) (100 * getAttack_speed()));
								enemyshow(enemy);
								if(enemy.getHp()<=0 || getHp() <= 0) {
									System.exit(0);
								}
							} catch (Exception e) {
								e.getStackTrace();
							}
						}
					}
				}.start();
			} else {
				
			}

			if (!enemy.isAir_unit() && this.isGround_attack()) {
				new Thread() {
					public void run() {
						while (enemy.getHp() > 0) {
							try {
								if (getDamage_type().equals(Damage_Type.Concussive)) {
									switch (enemy.getUnitType()) {
									case Large:
										enemy.setHp(enemy.getHp() - (getAttack() * 0.25));
										break;
									case Medium:
										enemy.setHp(enemy.getHp() - (getAttack() * 0.5));
										break;
									case Small:
										enemy.setHp(enemy.getHp() - getAttack());
										break;
									}
								} else if (getDamage_type().equals(Damage_Type.Explosive)) {
									switch (enemy.getUnitType()) {
									case Large:
										enemy.setHp(enemy.getHp() - getAttack());
										break;
									case Medium:
										enemy.setHp(enemy.getHp() - (getAttack() * 0.75));
										break;
									case Small:
										enemy.setHp(enemy.getHp() - (getAttack() * 0.5));
										break;
									}
								} else if (getDamage_type().equals(Damage_Type.Normal)) {
									switch (enemy.getUnitType()) {
									case Large:
										enemy.setHp(enemy.getHp() - getAttack());
										break;
									case Medium:
										enemy.setHp(enemy.getHp() - getAttack());
										break;
									case Small:
										enemy.setHp(enemy.getHp() - getAttack());
										break;
									}
								} else {
									System.out.println("마법유닛");
									return;
								}
								Thread.sleep((long) (100 * getAttack_speed()));
								enemyshow(enemy);
								if(enemy.getHp()<=0 || getHp() <= 0) {
									System.out.println(enemy.getHp() < 0 ? enemy.getName()+" 사망" : getName()+" 사망");
									System.exit(0);
								}
							} catch (Exception e) {
								e.getStackTrace();
							}
						}
					}
				}.start();
			} else {
				
			}
		}// end of is can attack
	}// end of method

	
	public void enemyshow(Unit enemy) {
		System.out.println();
		System.out.println(this.getName()+"이(가) "+enemy.getName()+"을(를) 공격!!");
		System.out.println("Unit name : "+enemy.getName());
		System.out.println("Unit HP : "+enemy.getHp());
		System.out.println("Unit attack : "+enemy.getAttack());
		System.out.println("Unit armor : "+enemy.getArmor() );
		System.out.println();
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPeople() {
		return people;
	}

	public void setPeople(int people) {
		this.people = people;
	}

	public double getHp() {
		return hp;
	}

	public void setHp(double hp) {
		this.hp = hp;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public double getAttack() {
		return attack;
	}

	public void setAttack(double attack) {
		this.attack = attack;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
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

	public boolean isCan_digging() {
		return can_digging;
	}

	public void setCan_digging(boolean can_digging) {
		this.can_digging = can_digging;
	}

	public Damage_Type getDamage_type() {
		return damage_type;
	}

	public void setDamage_type(Damage_Type damage_type) {
		this.damage_type = damage_type;
	}

	public UnitType getUnitType() {
		return unitType;
	}

	public void setUnitType(UnitType unitType) {
		this.unitType = unitType;
	}

	public boolean isAir_unit() {
		return air_unit;
	}

	public void setAir_unit(boolean air_unit) {
		this.air_unit = air_unit;
	}
}
