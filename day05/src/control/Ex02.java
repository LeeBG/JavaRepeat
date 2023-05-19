package control;

import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int num ;
	
		num = ran.nextInt();
		num %= 6; 	// num의 값을 6으로 나눈 나머지를 저장한다.
		num += 1;	// num의 값을 1 증가시킨다.
		
		if (num %2 ==  0) {
			System.out.println(num + " : 짝수");
		}
		// 둘 다 동시에 만족하는 경우가 없기 때문에 
		//if (num %2 !=  0) {
		else {		// (이전에 제시한 조건이 true가) 아니면 
			System.out.println(num + " : 홀수");
		}
	}
}
