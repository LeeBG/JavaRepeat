package abstractClass;

import java.util.Scanner;

class Test {};

class Test3 extends Object{
	// extends 를 지정하지 않으면 자동으로 Object클래스를 상속받는다.
	
	// 상속받는 메서드를 오버라이딩하기 위해 선택하는 메뉴 호출하기
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Test2";
	}
}

public class Ex08 {
	public static void main(String[] args) {
		Test ob1 = new Test();
		System.out.println(ob1.getClass().getSimpleName());
		
		Test3 ob2 = new Test3();
		System.out.println(ob2.getClass().getSimpleName());
		
		System.out.println("ob1  : "+ob1);
		System.out.println("ob2  : "+ob2);
		System.out.println("ob1 : "+ob1.toString());
		System.out.println("ob2 : " + ob2.toString());
		
		// 형태(타입)에 상관없이 어떤 객체를 저장히기 위해서 Object클래스를 사용하기도 한다.
		Integer num = new Integer(100);
		String str = new String("Hello\nWorld");
		Scanner sc = new Scanner(str);
		Runnable run = () -> System.out.println("Run");
		double[] a = {1,2,5,3};
		Object[] arr = {num, str, sc, run, a };
		// 장점 : 자료형에 상관없이 어떤 객체든 저장할 수 있다.
		// 단점 : 다른곳에서 꺼내서 사용하려면 다운 캐스팅을 일일히 해줘야 정상적으로 사용할 수 있다.
		
		System.out.println("sc == arr[2] : "+(sc == arr[2]));
		System.out.println(sc.nextLine());
//		System.out.println(arr[2].nextLine());	// 다운 캐스팅이 없으면 메서드를 호출할 수 없다.
		System.out.println(((Scanner)arr[2]).nextLine());
		
		
		// Object의 메서드를 오버라이딩 하는 내용 -> Ex07의 맨 마지막
	}
}
