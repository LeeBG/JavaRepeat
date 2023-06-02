package inheritance;

class Calc {				// 슈퍼 클래스, 부모 클래스, 상위 클래스
	protected int add(int n1,int n2) {
		return n1 + n2;
	}
}

class Calc2 extends Calc{	// 서브 클래스, 자식 클래스, 하위 클래스
	
	// 1) 상속받은 메서드의 접근 제한 범위를 더 줄일 수 없다.(넓히기는 가능)
	// 2) 상속받은 메서드의 반환형과 일치해야 한다.
	// 3) 상속받은 베서드의 이름과 매개변수 유형 및 갯수가 정확하게 일치해야한다.
	// 4) 슈퍼 클래스로 참조해도 메서드를 호출하면 서브 클래스에서 정의한대로 실행된다.
	
	@Override
	public int add(int n1, int n2) {
		System.out.printf("%d + %d = %d\n",n1, n2,n1+n2);
		return n1+n2;
	}
}


public class Ex05 {
	public static void main(String[] args) {
		
		// 슈퍼 클래스 객체
		Calc ob1 = new Calc();
		
		// 서브 클래스 객체
		Calc2 ob2 = new Calc2();
		
		int n1 = ob1.add(10, 20);
		int n2 = ob2.add(12, 23);			// 출력이 일어난다.
		
		System.out.println("n1 : "+n1);
		System.out.println("n2: "+n2);
		
		// 서브 클래스의 객체는 슈퍼클래스 타입이다.
		// 학생은 사람이다.
		// 고양이는 동물이다.
		// 강아지는 동물이다.
		// Calc2는 Calc이다.
		
		
		Calc ob3 = new Calc2();
		int n3 = ob3.add(100,200 );	// 서브 클래스의 함수가 실행이 된다.
		System.out.println(n3);			// ob3의 자료형은 Calc이지만(슈퍼 클래스)
																	// add의 실행 내용은 Calc2(서브클래스)의 add를 따라간다.
		
		
		
	}
}
