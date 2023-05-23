package input;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		// 생년월일 8자리를 정수로 입력받아서
		// 올해 연도를 이용하여 나이를 계산하여 출력하기
		
		// 출생 : yyyy-MM-dd
		// 나이 : x살
		
		final int currentYear = 2023;
		int birthYear;
		int month;
		int date;
		int age;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("생년월일을 입력해주세요(8자리) : ");
		
		int sang = Integer.parseInt(sc.nextLine());
		
		birthYear = sang / 10000; 
		age = currentYear - birthYear + 1;
		month = (sang % 10000) / 100;
		date = (sang % 10000) % 100;
		
		System.out.printf("출생 : %4d-%02d-%02d \n",birthYear, month, date);
		System.out.printf("나이 : %d살 \n",age);
		
		sc.close();
		
	}
}
