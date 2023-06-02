package constructor;

class Pos {
	int x;
	int y;
	
	// 생성자 오버로딩 : 같은 이름의 여러 생성자를 작성할 수 있다.
	// 이 때 구분하는 기준은 매개변수의 자료형, 갯수이다.
	
	Pos(int x, int y) {
		this();				// 생성자 내부에서 또 다른 생성자를 호출할 경우 this를 사용한다.
									// 생성자 내부에서 또 다른 생성자를 호출하는 코드는 반드시 첫줄에만 작성할 수 있다.
									// 이 코드는 반드시 첫 번째 줄에서만 호출되어야 한다.
		this.x = x;
		this.y = y;
	}

	Pos() {
		System.out.println("Pos 객체 생성!!");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}

public class Ex04 {
	public static void main(String[] args) {
		// 자바에서는 몇몇의 특수 상황을 제외하면 생성자를 호출해야만 객체를 생성할 수 있다.
		
		// Member m1;						// 참조 변수는 있으나, 변수가 가리키느 대상을 지정하지 않았다.
		// m1.name = "이지은";		// c++에서는 이게 된다.
		
		// Member m1 = new Member();		// 생성한 객체를 참조 변수가 참조한다.
		// m1.name = "이지은";		// 대입 가능
		
		Pos ob1 = new Pos();
		ob1.x = 2;
		ob1.y = 5;
		System.out.printf("[%d,%d]\n", ob1.x, ob1.y);
		
		Pos ob2 = new Pos(3,4);
		System.out.printf("[%d,%d]\n", ob2.x, ob2.y);
		
	}
}
