package control;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		/*
			지하철 1구간 당 평균 이동시간이 4분이라고 가정한다.
			이동한 구간 수를 입력받아서, 걸린 시간을 출력하세요 
			단, 시간이 60분 이상이면 시간과 분을 구분하여 출력하고
			시간이 60분 미만이면 분만 출력하세요
		 */
		Scanner sc = new Scanner(System.in);
		int total_time,gugan;
		
		System.out.print("총 이동한 구간 수를 입력하세요 : ");
		gugan = Integer.parseInt(sc.nextLine());
		total_time = 4 * gugan;
		
		if(total_time >= 60) {
			System.out.printf("총 %d 구간 이동하는데 %2d시간 %2d분  이 소요됩니다.",gugan,(total_time/60),(total_time%60));
		}else {
			System.out.printf("총 %d 구간 이동하는데 %2d분 소요됩니다.",gugan,total_time);
		}
	}
}
