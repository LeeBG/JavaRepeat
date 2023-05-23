package loop;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		
		// 사용자에게 1~100사이의  정수를 입력받아서
		// 전체 길이에서 입력한 수치 이전은 #을 출력하고
		// 이후는 공백을 출력한다
		// 단 항상 가운데에는 입력한 수치를 %형태로 출력 해야한다.
		Scanner sc = new Scanner(System.in);
		int input,half;
		int per=1;
		
		System.out.print(" 1 ~ 100 사이의 정수 %를 입력하세요  ");
		per = sc.nextInt();
		
		String bar = "[";
		
		if(per >= 50) {
			for(int i=0;i<25;i++) {
				bar += "#";
			}
			bar += " "+ per+" % ";
			for(int i=25;i<(per/2);i++) {
				bar += "#";
			}
			for(int i=(per/2);i<50;i++) {
				bar += " ";
			}
		}else {
			for(int i=0;i<(per/2);i++) {
				bar += "#";
			}
			for(int i=(per/2);i<25;i++) {
				bar += " ";
			}
			bar +=  " "+per + " % ";
			
			for(int i=0;i<25;i++) {
				bar += " ";
			}
		}
		
		System.out.println(bar+"]");
		
		
		System.out.print("1 ~ 100 정수 입력 :");
		input = sc.nextInt();
		half = input / 2;
		System.out.println("[");
		for(int i = 0;i <  50; i++) {
			if(i == 25) {
				System.out.printf(" %d %% ", input);
			}else if(i < half) {	// 입력값 (잘반)보다 작은 구간은 # 
				System.out.print("#");
			}else {							// 입력값(절반) 보다 작은 구간은 공백
				System.out.print(" ");
			}
		}
		System.out.println("]\n");
		System.out.println("끝");
		
		sc.close();
		
		
	}
}
