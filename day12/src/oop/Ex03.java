package oop;

// 클래스의 구성요소
class Test1 {
	// 멤버 필드 		: 	변수 , 객체가 소멸하기 전까지 유지되는 변수
	private int n1 = 10;				// 초기값을 지정할 수 있다.
	private int n2;						// 초기값을 지정하지 않으면, 자료형에 맞게 0에 해당하는 값으로 초기화된다.(like 정수배열)
	
	
	// 멤버 메서드 	: 	함수, 클래스에 의해 생성된 객체는 메서드를 호출할 수 있다.
	// 							메서드 내부에서는 멤버 필드를 참조할 수 있다.
	void showAdd() {
		System.out.printf("%4d +%4d = %4d\n", n1,n2,n1+n2);
	}
	void showMultiple(int m) {		// 이 때 매개변수는 함수 지역 내에서만 유효한 지역변수이다.
		System.out.printf("%4d x%4d = %4d\n", n1,n2,n1*n2);
	}
	
	// 생성자			:	객체를 생성할 때 초기값을 지정하거나, 초기 작동을 지정하는 특수한 함수
	// 생성자는 클래스의 이름과 동일한 이름을 가지는 함수
	// 생성자는 반환형을 가지지 않는다.
	Test1() {
		System.out.println("객체를 생성하면 생성자가 호출됩니다.!!");
	}
	
	// 접근 제한자 	:	내부 멤버 요소(필드, 메서드, 생성자)에 대한 외부로부터의 접근을  제한하는 요소
	
}

public class Ex03 {
	public static void main(String[] args) {
		Test1 ob1 = new Test1();			// 생성자는 호출하여 객체를 생성하고
																	// 객체를 참조 변수가 가리키도록 처리한다.
		
		Test1 ob2 = new Test1();		// 하나의 클래스로 서로 다른 객체를 생성할 수 있다.
		
		ob1.showAdd();
		ob2.showMultiple(2);
	}
}
