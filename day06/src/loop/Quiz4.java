package loop;

import java.util.Random;
import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		// 랜덤을 활용한 업다운 게임을 작성하세요
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int answer,num=0,cnt=0;
		int max,min;
		System.out.println("1 ~ n 까지의 수 중 랜덤으로 한 숫자를 맞추는 프로그램입니다.");
		System.out.print("최대 숫자(n)를 입력하세요!! : ");
		int n = sc.nextInt();
		System.out.println("1부터 "+n+"까지의 수 중 하나를 맞춰보세요 !!!! \n");
		answer = ran.nextInt(n)+1;
		System.out.println("=====================================================");
		
		// 최댓값과 최소값의 범위를 설정해준다.
		max = n;
		min = 1;
		
		while(num != answer) {
			System.out.print("\n숫자를 입력하세요 : ");
			num = sc.nextInt();	
			// 가장 먼저 잘못된 입력인지 검사해준다.
			if(num < min || num > max){
				System.out.println("\n 잘못 입력하셨습니다 다시 입력하세요 ..");
				System.out.printf("%d과 %d사이의 수",min,max);
			}
			else if(num < answer) {
				min = num;
				System.out.println("\n사용자가 입력한 수가 정답보다 작습니다. - 업");
				System.out.printf("%d과 %d사이의 수",min,max);
				cnt +=1;
			}else if(num > answer) {
				max = num;
				System.out.println("\n사용자가 입력한 수가 정답보다 큽니다. - 다운");
				System.out.printf("%d과 %d사이의 수",min,max);
				cnt+=1;
			}else {
				cnt += 1;
			}
		}
		System.out.println("["+cnt+"]회 시도 후 정답!!! : " + num);
		sc.close();	// Scanner 닫기
	}
}
