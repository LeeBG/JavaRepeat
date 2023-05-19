package control;

import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		/*
		 * 	사탕 1개에 500원입니다.
		 * 	50개 이상 구매하면 전체의 8%를 할인하고
		 * 	100개 이상 구매하면 전체의 12%를 할인합니다.
		 * 
		 * 	구매 수량을 입력하여 결재할 금액을 계산하여 출력하세요
		 * 	(단, 각각의 할인율은 중복해서 적용할 수 없습니다.)
		 * 
		 */
//		System.out.printf("결제 금액 : %,d원 \n",12000); // 1000단위 구분기호를 사용할 수 있다.
		
		final int price = 500;
		int candy,total;
		Scanner sc = new Scanner(System.in);
		System.out.print("몇개의 사탕을 구매하시겠습니까 : ");
		candy = Integer.parseInt(sc.nextLine());
		
		total = candy * price;
		
		if (candy >= 100) {
			total = total*88/100;
		}else if(candy >= 50) {
			total = total*92/100;
		}
		
		System.out.printf("총 결제 금액 : %,d원 ",total);
		
		sc.close();
	}
}
