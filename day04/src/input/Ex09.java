package input;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		// java 1.5 부터 등장
		Scanner sc = new Scanner(System.in);
		
		// 정수 입력받기
		int num;
		System.out.print("정수 입력 : ");
		num = sc.nextInt();		// 숫자, \r \n
		
		// 정수 입력받기
		int num2;
		System.out.print("정수 입력 : ");
		num2 = sc.nextInt();		// 숫자, \r \n
		
		// 실수 입력 받기
		double db;
		System.out.print("실수 입력 : ");
		db = sc.nextDouble();	// 숫자, \r \n
		
		// 실수 입력 받기
		double db2;
		System.out.print("실수 입력 : ");
		db2 = sc.nextDouble();	// 숫자, \r \n
		
		sc.nextLine();			// 버퍼 비우기(엔터키값을 버퍼에서 비워준다)
		
		// 문자열 입력받기
		String str;
		System.out.print("문자열 입력 : ");
//		str = sc.next();
		str = sc.nextLine(); 		// 줄 단위, 엔터키를 입력할 때 까지의 내용을 가져온다.
		// 버퍼가 정리되지 않았다면 정상적으로 처리할 수 없다.
		System.out.println("num : "+num);
		System.out.println("num2 : "+num2);
		System.out.println("db : "+db);
		System.out.println("db2 : "+db2);
		System.out.println("str : "+str);
		
		
		
		sc.close();
	}
}
