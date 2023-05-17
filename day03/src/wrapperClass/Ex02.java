package wrapperClass;

public class Ex02 {
	public static void main(String[] args) {
		// Wrapper Class와 primitive type사이의 값 대입
		
		// float과 long은 대표 자료형이 아니므로 F혹은 L을 값 뒤에 붙인다.
		
		float fl = 1.2F;
		double  db = 0;
		
		db =fl ;		//primitive type 끼리는 호환이 되므로 대입이 가능하다.
							// 왼쪽 변수의 자료형이 더 크기 때문에 값의 손실이 없어서 암묵적 형변환이 발생한다.
		
		System.out.println("fl : "+fl + ", db : "+db);
		
		
		Float fl2 = 1.2F;
		Double db2 = 0.0;		//int 0 을 바로 담을 수 없어서, 실수 형태로 나타내야한다.
		
//		db2 = fl2;  // Wrapper Class끼리는 같은 실수 라도 서로 호환되지 않는다.
							   // Wrapper Class 는 자신과 같은 타입의 primitive 만 호환된다.
		
//		db2 = (Double)fl2;		// 강제 형변환을 시도해도, 호환이 되지 않으므로 처리할 수 없다.
		

		// 형변환 하는 방법
		/*
		 1)
		 Float -> float -> double -> Double */
//		db2 = (double)(float)fl2;
		
		/*
		2)
		Float의 Wrapper클래스에서 doubleValue()로 형변환
		 */
//		db2 = fl2.doubleValue();
		
		/*
		 3)
		 Double의 valueOf(fl2);
		 로 Double타입으로 형변환하는 방법
		 */
//		db2 = Double.valueOf(fl2);
		System.out.println("fl2 = "+fl2+" db2 = " +db2 );
		
		// 2) Wrapper클래스에서 제공하는 함수를 활용한다.
		
		
	}
}
