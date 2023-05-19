package control;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("정수 입력 : ");
		num = sc.nextInt();
		/*
		if(num > 0) {
			System.out.println("양의 정수");
		}
		else {
			if(num < 0) {
				System.out.println("음의 정수");
			}
			else {
				System.out.println("Zero");
			}
		}
		*/
		
		if(num > 0) {
			System.out.println("1) 양의 정수");
		}
		else  if(num < 0) {
				System.out.println("2) 음의 정수");
		}	
		else {
			System.out.println("3) Zero");
		}
		sc.close();
	}
}
