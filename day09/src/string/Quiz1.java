package string;

public class Quiz1 {
	public static void main(String[] args) {
		// Luhn 알고리즘
		
		/*
		 * 	카드번호 16자리의 글자를 이용하여 카드번호의 유효성 검증하는 알고리즘
		 * 	우측부터 세어서 홀수번째는 그대로 두고 짝수 번째는 두배로 만든다.
		 * 	만약 두 배로 만들어진 값이 두 자리 수가 되면 각 자릿수를 합한다.
		 * 	이렇게 만들어진 16자리의 정수를 더하여 그 합이 10으로 나누어 떨어지면 유효한 카드번호, 그렇지 않으면 
		 * 	유효하지 않은 카드번호이다.
		 * 
		 * 	문자열로 카드번호를 xxxx-xxxx-xxxx-xxxx형식으로 전달받아서 
		 * 	유효성을 true/false로 반환하는 함수를 작성하고 테스트 하세요
		 */		
		String t1 = "2720-1234-5678-1357";
		String t2 = "1720-1234-5678-1357";
		
		boolean b1 = checkCardNumber(t1);
		boolean b2 = checkCardNumber(t2);

		System.out.println("b1 : " + b1);
		System.out.println("b2 : " + b2);
	}

	static boolean checkCardNumber(String cardNumber) {
		boolean answer = false;
		cardNumber = cardNumber.replace("-", "");
		if(cardNumber.length() != 16) {
				return false;
		}
		int sum = 0;
		for(int i=0;i<cardNumber.length();i++) {
			char ch = cardNumber.charAt(i);
			int num = ch - 48;
//			System.out.printf("ch : %c, %d\n",ch, (int)ch);
//			System.out.println(num);
			
			// 홀수번째는 그대로, 짝수 번쨰는 두배
			
			if(i % 2 == 0) {
				num *= 2;
				if(num >= 10) {			// 만약에 더한 값이 두자리 수 이상이면 (10 이상이면)
					num = num / 10 + num % 10;	// 1의 자리와 1의 자리를 더한다.
				}
			}
			sum  += num;
		}
		answer = sum % 10 == 0;				// 그 합이 10으로 나누어 떨어진다. true이다.
		return answer;
	}
}
