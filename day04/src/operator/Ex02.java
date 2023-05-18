package operator;

public class Ex02 {
	public static void main(String[] args) {
		// 논리 연산자의 특징
		// 1) A && B 는 양쪽 모두 true 이여야 전체 결과가 true이다.
		// 만약, A가 false라면 B의 결과에 상관없이 전체 결과가 false이다.
		// 따라서, A가 false라면 B의 내용은 체크하지 않는다.(코드를 수행하지 않는다.)
		
		// 2) A || B 는 양쪽 모두 false이여야 전체 결과가 false이다.
		// 만약, A가 true라면 B의 결과에 상관없이 전체 결과가 true이다.
		// 따라서, A가 true이면 B의 내요은 체크하지 않는다. (코드를 수행하지 않는다.)
		
		int a = 2, b=1,c=0,d=-1;
		
		System.out.printf("%d %d %d %d \n",a,b,c,d);
		
		boolean bo1 = a++ + ++b < 0 && c++ - d-- == 0;
		System.out.println("bo1 : " + bo1);
		// 3 2 0 -1; // 두번째 조건이 실행되지 않았기 때문이다.
		System.out.printf("%d %d %d %d \n",a,b,c,d);
		
		
		boolean bo2 = ((a *= 2) > b ) || ((d *= c) != 0);
		System.out.println("bo2 : " + bo2);			// or 연산에서 앞의 조건이 true이기 때문에 뒤의 조건이 실행되지 않았다는 증거이다.
		System.out.printf("%d %d %d %d \n",a,b,c,d);
		
		// 제어문의 조건으로 활용할 때 !flag 형식으로 사용하거나
		// flag == false형식으로 사용할 수 있다.
		
		int age = 15;
		boolean isAdult = age >= 20;
		if(!isAdult) {
			System.out.println("성인이 아닙니다!!");
		}
		if(isAdult == false){		// 명확하게 표현하고 싶을 때
			System.out.println("성인이 아닙니다 !!");
		}
	}
}
