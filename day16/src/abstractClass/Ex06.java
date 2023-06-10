package abstractClass;

import java.util.Arrays;
import java.util.Comparator;

// 람다식
public class Ex06 {
	public static void main(String[] args) {
		// 인터페이스도 추상클래스에 속하기 때문에, 익명 내부 클래스 문법을 사용할 수 있다.
		Runnable run1 = new Runnable() {
			@Override
			public void run() {								// 매개변수의 갯수가 0이라 (생략 불가)
				System.out.println("run1");		// 코드가 한줄 (생략 가능)
			}
		};
		run1.run();
		
		Runnable run2 = () -> {System.out.println("run2");};
		run2.run();
		
		
		// 람다식의 기본 형식 : () -> {}
		// () 함수의 매개변수를 작성하는 공간
		// -> 	: 람다식 기호
		// {}  	: 함수의 실행 내용(body), 실행코드가  한 줄이면 {} 를 생략한다.
		// 		: 한줄의 실행코드가 return 이면 return도 생략한다.
		
		Comparable<String> comp1 = new Comparable<String>() {
			@Override
			public int compareTo(String o) {			// 매개변수 1개 (생략 가능)
				return "hello".compareTo(o);				// 실행코드 1줄 (생략 가능)
			}
		};
		int res1 = comp1.compareTo("Hello");
		System.out.println("res1 : "+ res1);
		
		
		/*
		 
		  생략 이전
		  
		Comparable<String> comp2 = new Comparable<String>() {
			@Override
			public int compareTo(String o) {
				return "hello".compareTo(o);
			}
		};
								 |
								\/
		*/
		
		// 매개변수가 한개라 매개변수 타입과 () 생략 
		// 코드가 한줄이라 {} 생략
		// 한줄 실행코드가 return이라면 return도 생략할 ㅅ 있다.
		Comparable<String> comp2 = o -> "hello".compareTo(o);
		
		int res2 = comp2.compareTo("Hello");
		System.out.println("res2 : "+ res2);
		
		Comparator<Integer> comp3 = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};
		Integer n1 = 10;
		Integer n2 = 20;
		int res3 = comp3.compare(n1, n2);
		System.out.println("res3 : "+res3);
		
		// 익명클래스와 람다식 같은 결과를 반환한다.
		Comparator<Integer> comp4 = (o1,o2) -> o1.compareTo(o2);
		int res4 = comp4.compare(n1, n2);
		System.out.println("res4 : "+res4);
		
		// Comparator 활용
		Integer[] arr = { 4,8,2,7,6 };
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr,comp4);
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr,(a,b) -> a.compareTo(b));
		System.out.println(Arrays.toString(arr));
		
	}
}
