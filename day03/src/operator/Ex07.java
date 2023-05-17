package operator;

public class Ex07 {
	public static void main(String[] args) {
		// 단항 증감 연산자 : 값을 1 증가 시키거나 감소시킨다.
		int num = 10;
		
		System.out.println("num++ :  " + num++);	 // 후위연산, 코드가 수행된 후 연산한다.
		System.out.println("++num :  " + ++num);	// 전위 연산, 먼저 연산하고 코드를 수행한다.
		System.out.println("--num :  " + --num);	// 연산자의 위치에 따라 우선순위가 달라진다.
		System.out.println("num-- :  " + num--);	// 먼저 출력하고 나중에 감소한다.
		System.out.println("");
		System.out.println("num : "+ num); // 감소된 값
		
		
		int i = 0;
		for (i = 0; i<5;i++) {
			System.out.println("i : " + i );
		}
		System.out.println();
		
	}
}
