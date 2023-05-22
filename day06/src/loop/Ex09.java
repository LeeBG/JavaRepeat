package loop;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		// 사용자에게 0을 입력받을 때까지 정수를 반복하여 입력받고 그 합계를 출력하기
		// 일단 최초로 한 번은 종속문을 실행을 하고 이후에 조건을 따져서 참이면 계속해서 반복을 하는 구조가
		// do - while 문이다.
		
		Scanner sc = new Scanner(System.in);
		int total  = 0;
		int input;
		
		do {
			System.out.print("정수 입력 : ");
			input = sc.nextInt();
			total += input;
		}while(input != 0);
		
		System.out.println("합계 : "+ total);
		sc.close();
	}
}
