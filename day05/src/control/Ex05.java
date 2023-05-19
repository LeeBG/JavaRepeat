package control;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int score;
		
		System.out.print("점수 입력 (0 ~ 100) : ");
		score = sc.nextInt();
		
		if(score < 0 || 100 < score) {
			System.err.println("점수가 범위를 벗어났습니다.");
			sc.close();
			return ;			// 함수를 즉시 종료시킴(여기서 함수는 main()밖에 없다.)
		}
		
		System.out.println("점수 : " + score);
		sc.close();
	}
}
