package operator;

public class Ex03 {
	public static void main(String[] args) {
		// 삼항연산자
		// A ? B  : C
		// A 조건이 참이면 B값으로 결정하고, 아니면 C값으로 결정한다.
		// 조건이 참이면 서로 다른 값 중 하나를 결정짓는 연산자
		
		// 삼항 연산자는 if문과 비슷하지만 다르다.
		// if 는 조건에 따라서 서로 다른 코드를 수행하는 것이 목적(행위)
		// 삼항연산자는 두개의 값 중 하나를 결정짓는 것이 목적(값)
		
		int age = 25;
//		age = 15;
		boolean isAdult = age >= 20;
		
		String adult = isAdult ? "성인" : "미성년자";
		System.out.println("adult : " + adult);
	
		System.out.println("삼항 연산자 중첩 예시");
		
		int num = 3;
		String oddEven = num % 2 == 0 	// num이 0이면
															? "제로"		// Zero를 대입
															: num % 2 == 0	// 0이 아니고 num이 2로 나누어 떨어지면	
																? "짝수"			//짝수를 대입
																	: "홀수";		// 아니면 홀수를 대입
		
		System.out.println("oddEven : " + oddEven);
		
		// 잘못된 예시
//		num % 2 == 0 ? System.out.println("짝수") : System.out.println("홀수");
		
		String test = "123411";
		int test2 = isDigit(test) ? Integer.parseInt(test) : 0;
		System.out.println("test2  : " + test2);
		
	}
	
	
	// 문자열의 글자들이 모두 숫자로만 구성되었는지 검사하여 결과를 boolean타입으로 반환하는 함수
	static boolean isDigit(String s) { // 문자열의 s를 전달받아서
		boolean answer = true;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i)<'0' || '9' < s.charAt(i)) {
				return false;
			}
		}
		return answer;
	}
}
