package control;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		// 서로 다른 두 정수를 입력받아서 큰 수를 출력하세요
		// 만약 같으면 아무 수나 출력해도 됩니다.
		Scanner sc = new Scanner(System.in);
		int n1,n2;
		System.out.print("띄어쓰기로 구분하여 크기를 비교할 두 수를 입력하세요 : ");
		n1 = Integer.parseInt(sc.next());
		n2 = Integer.parseInt(sc.next());
		if (n1 < n2) 
			System.out.println("큰 값 : "+n2);
		else 
			System.out.println("큰 값 : "+n1);
		sc.close();
	}
}
