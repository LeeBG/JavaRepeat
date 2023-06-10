package abstractClass;

import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;

// 인터페이스는  추상 클래스의 한 종류이다.
// 인터페이스는 자료형으로 사용할 수 없다.
// 인터페이스는 모든 필드는 public static final이다.
// 인터페이스의 모든 메서드들은 public abstract이다.
// 인터페이스는 extends대신 implements 키워드로 상속(구현)처리한다.
// 인터페이스는 일반적인 상속과는 달리, 다중 상속을 지원한다.
// 인터페이스에서 생성된 메서드는 모두 public abstract이기 때문에 구현을 강제한다.

interface Test1 {
//	private int n1 = 10; // 접근제한자를 마음대로 바꿀 수 없다.
	int n1 = 10;					// public static final이 알아서 붙기 때문이다.
	public static final int n2  = 20;			// public static final int를 붙이면 상관이 없다.
	

	void show();				// public abstract 추상메서드이기 때문에 구현을 interface안에서 할 수 없고
	// 익명클래스나 상속을 통해서 구현할 수 있다.
	// default를 함수에 지정하면 인터페이스 내부에서도 코드를 작성할 수는 있긴 하지만 지금은 사용하지 않는다.
	
	void close() throws IOException;
}

// 다중 상속이 가능하다.(인터페이스 들만)
class Test2 implements Test1,Serializable,Closeable{

	private static final long serialVersionUID = 1L;
	@Override
	public void show() {
		System.out.printf("%d %d\n",n1,n2);
	}

	@Override
	public void close() throws IOException{
		System.out.println("close !!");
	}

}


public class Ex04 {
	public static void main(String[] args) throws Exception{
		Test2 ob = new Test2();
		ob.show();
		ob.close();
	}
}	
