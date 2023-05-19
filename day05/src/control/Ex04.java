package control;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		String result = "2의 배수가 아니고, 3의 배수도 아님";
		
		System.out.print("정수 입력 : ");
		num = sc. nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num + ": 2의 배수");
		}
		else if(num % 3 == 0) {
			System.out.println(num + ": 3의 배수");
		}
		else {
			System.out.println("2,3의 배수는 아닌듯");
		}
		
		sc.close();
		
	}
}
