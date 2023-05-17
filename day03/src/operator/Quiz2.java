package operator;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		/*
		 * 	정수값 문자열로 형식에 맞게 변환
		 */
		long cardNumber;
		Scanner sc = new Scanner(System.in);
		System.out.print("카드 번호 16자리를 입력 : ");
		cardNumber = Long.parseLong(sc.nextLine());
		long n = 0;
		
		System.out.println("cardNumber : " + cardNumber);
		//위 숫자를 4자리씩 분리하여 사이에 "-"를 더하여 출력하세요
		
		String result = "";
		while(cardNumber / 10000 != 0) {
			n = cardNumber % 10000;
			result += "-"+n;					// 복합대입연산자 복습
			
			cardNumber = cardNumber / 10000;
			if (cardNumber / 10000 == 0 ) { // 맨 앞 4자리
				result  = cardNumber + result;
			}
		}
		
		System.out.println("result = " + result);
		
		sc.close();		// Scanner 좀 닫아라
		
	}
}
