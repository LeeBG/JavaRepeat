package control;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// 중첩 if문
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		
		if(num % 2 == 0) {
			if(num % 3 == 0) {
				System.out.println("2와 3의 공배수 (6의 배수)");
			}else {
				System.out.println(num + " : 2의 배수이고, 3의 배수는 아님");
			}
		}
		else {
			System.out.println(num + ": 2의 배수가 아님");
		}
		
		sc.close();
	}
}
