package control;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		// 서로 다른 세 정수를 입력받아서 큰 수를 출력하세요
		// 만약 같으면 아무 수나 출력해도 됩니다.
		
		int n1,n2,n3,max;
		Scanner sc = new Scanner(System.in);
		System.out.print("띄어쓰기로 구분하여 세 정수를 입력하세요 : ");
		n1 = Integer.parseInt(sc.next());
		n2 = Integer.parseInt(sc.next());
		n3 = Integer.parseInt(sc.next());
		
		// n1이 가장 크다고 가정한다.
		max = n1;
		
		if(max < n2) 
			max = n2;
		if(max < n3) 
			max = n3;
		
		System.out.printf("큰 수 : %d",max);
		
		sc.close();
		
		// 경우에 따라서는 if 만 단독으로 여러개를 써도 유리한 경우가 있다. 
	}
}	
