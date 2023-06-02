package static_final;

class Test2{
	// final : 변경할 수 있다. 마지막 값이다.
	// 지역변수에 사용가, 처음 설정한 값을 이후 변경할 수 없다.
	// 멤버필드에 사용가능, 처음 설정한 값을 이후 변경할 수 없다.
	// 메서드에 사용가능, 함수의 내용을 변경할 수 없다.(오버라이딩 불가)
	// 클래스에 사용가능, 클래스의 구성을 변경할 수 없다.(상속 불가)
	
	final int n3 = 10;
	final int n4;
	private final int n5 = 30;
	// static final은 접근제한자를 public으로 설정하는 거의 유일한 경우이다.
	public static final String ACADEMY_NAME = "KGITBANK";
	final int n6 = Integer.MAX_VALUE;		//클래스에 딱 하나만 있는 변수고 값을 바꿀수 없다.

	Test2(int n4) {				// final 멤버 필드는 생성자를 통한 초기화가 가능하다.
		this.n4 = n4;
	}
	
	public int getN5() {		// final 필드에 대한 getter는 생성가능
		return n5;						// setter는 값을 대입하는 함수이므로 생성 불가
	}



}

public class Ex03 {
	public static void main(String[] args) {
		int n1 = 10;
		final int n2;				// 지역변수로 쓴다면 초기화를 생성과 동시에 안해도 된다.
		n1+=1;
		n2 = 20;
//		n2+=1;							// final은 값 변경이 불가능하다.
		System.out.println(n1);
		System.out.println(n2);
		
		
		System.out.println("학원이름  : " + Test2.ACADEMY_NAME);
	}
}
