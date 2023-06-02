package static_final;

class Test1{
	int n1= 10;
	static int n2 = 20;
}
public class Ex01 {
	public static void main(String[] args) {
		// static  : 객체마다 서로 다른 값이 아니라, 클래스에 '고정'된 값
		
//		System.out.println("Test1.n1 : " + Test1.n1);
		System.out.println("Test1.n2 : " + Test1.n2);
		
		Test1 ob = new Test1();
		System.out.println("ob1.n1 : "+ob.n1);
		System.out.println("ob1.n2: "+ob.n2);
//		The static field Test1.n2 should be accessed in a static way
//		서로 다른 객체들이 공유하는 값이 된다.
		
	}
}
