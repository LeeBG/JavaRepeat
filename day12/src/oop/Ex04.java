package oop;

class Test2 {
	int n1;
	
	void up(int n3) {
		int n2 = 0;
		n1 += 1;
		n2 += 1;
		n3 += 1;
		System.out.println("n1 : "+n1);	//	멤버 필드	: 	객체 소멸 전까지 유지
		System.out.println("n2 : "+n2);	//	지역 변수	: 	함수 실행시 생성되고 종료되면 소멸함
		System.out.println("n3 : "+n3);	//	매개 변수	: 	함수 실행시 값이 지정되고 종료되면 소멸함
																			//	(매개변수도 지역변수의 일종이다)
		System.out.println();
	}
	
	
	// 	각각의 생명주기
	// - 멤버 필드는 객체가 소멸하기 전까지 유지됨(GC가 Heap에 있는 객체를 소멸시킬 때 - 어떠한 참조변수도 객체를 가리키지 않을 때)
	// - 매개변수와 지역변수는 함수가 종료되면 소멸(함수 호출시에 Stack 메모리에 저장되었다가  함수 종료시에 소멸)
}

public class Ex04 {
	public static void main(String[] args) {
		Test2 ob = new Test2();
		
		ob.up(10);
		ob.up(20);
		ob.up(25);
		
		// 이전의 객체는 소멸했다.(GC)
		ob = null;						
		ob = new Test2();	// 새로운 객체
		ob.up(10);
		
		System.out.println("ob.n1 : "+ob.n1);
		// . 연산자는 객체 내부 멤버 요소에 접근하는 연산자이다.(필드, 메서드)
		// ~의 (소유격 조사) 에 해당하는 기호이다.
		// o1.name : o1객체 내부의 필드 name;
		// o2.name : o2객체 내부의 필드 name;
	}
}
