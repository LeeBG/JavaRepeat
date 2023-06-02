package reference;
class Unit{
	String name;			// 이름
	int hp;						// 체력
	int atk;						// 공격력
	
	Unit(String name,int hp, int atk) {
		this.hp = hp;
		this.atk = atk;
		this.name = name;
	}
	
	void attack(Unit other) {
		other.hp -= this.atk;
	}
	boolean isAlive() {
		return this.hp > 0;
	}
	
}

public class Ex06 {
	public static void main(String[] args) {
		
		Unit ob1 = new Unit("울트라",400,20);
		Unit ob2 = new Unit("아칸",360,23);
		
		while(true) {
			
			ob1.attack(ob2);
			System.out.printf("%s : %d vs %d : %s\n",ob1.name, ob1.hp, ob2.hp,ob2.name);
			
			if(ob1.isAlive() != ob2.isAlive()) break;
			
			ob2.attack(ob1);
			System.out.printf("%s : %d vs %d %s\n", ob1.name,ob1.hp, ob2.hp,ob2.name);
			
			if(ob1.isAlive() != ob2.isAlive()) break;
		}
	}
}
