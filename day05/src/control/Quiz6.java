package control;

import java.util.Scanner;

public class Quiz6 {
	public static void main(String[] args) {
		/*
			놀이기구 이용시간에 따른 요금을 계산하여 출력하세요
			
			기본요금은 3천원이며 10분당 500원의 요금이 추가로 발생합니다.
			기본요금이 적용되는 구간은 0 ~ 30분입니다.
			
			시간 			금액
			0 ~ 30		3,000원
			31~40		3,500원
			41~50		4,000원
			51~60		4,500원
			...								
			
			이후 시간대에서도 동일한 규칙으로 적용되어야 합니다.
			
		 */
		final int basic_fee = 3000;
		int time,add_fee,total_fee;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("총 놀이기구 이용 시간을 입력하세요 : ");
		time = Integer.parseInt(sc.nextLine());
		
		if(time <= 30) {
			add_fee = 0;
		}else {
			add_fee = ((time-31)/10+1)*500;	
		}
		
		total_fee = basic_fee + add_fee;
		
		System.out.printf("총 금액은 : %,d원\n",total_fee);
		
		sc.close();
	}
}
