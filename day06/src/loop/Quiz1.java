package loop;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		
		// 정수를 하나 입력 받아서, 1부터 입력받은 정수까지 한 줄에 출력하는 코드를 작성하세요
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.printf("정수를 하나 입력해주세요 :");
		num = sc.nextInt();
		
		for(int i =1 ; i<=num;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("프로그램 종료");
		sc.close();
	}
}
