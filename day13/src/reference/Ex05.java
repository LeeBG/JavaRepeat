package reference;

class Ball {}			// 아무 내용  없는 공 (빈 생성자와 Object에서 상속받은 것들만이 있음)

class Kid {
	// 필드										// 초기값 
	private Ball ball;					// null
	private String name;		// null
	
	// 생성자 
	public Kid(String name) {
		this.name=name;			// name의 초기값은 객체 생성할때 받는 인자값
	}
	
	// 메서드
	public void setBall(Ball ball) {
		this.ball = ball;
	}
	
	public Ball getBall() {
		return ball;
	}
	
	public String getName() {
		return name;
	}
	
	
	public void throwBall(Kid other) {
		other.setBall(this.ball);
		ball = null;
		System.out.printf("%s가 %s에게 공을 던졌다. \n",this.name, other.name);
	}
	
	public boolean hasBall() {
		return ball != null;
	}
}

public class Ex05 {
	public static void main(String[] args) {
		Kid ob1 = new Kid("도기");
		Kid ob2 = new Kid("지훈이");
		Ball ball = new Ball();
		
		ob1.setBall(ball);
		System.out.println("ob1이 공을 가지고 있는가 ?? " + ob1.hasBall());
		System.out.println("ob2가 공을 가지고 있는가 ?? " + ob2.hasBall());
		System.out.println();
		
		ob1.throwBall(ob2);
		System.out.println("ob1이 공을 가지고 있는가 ?? " + ob1.hasBall());
		System.out.println("ob2가 공을 가지고 있는가 ?? " + ob2.hasBall());
		System.out.println();
		
		ob2.throwBall(ob1);
		System.out.println("ob1이 공을 가지고 있는가 ?? " + ob1.hasBall());
		System.out.println("ob2가 공을 가지고 있는가 ?? " + ob2.hasBall());
		System.out.println();
		
	}
}
