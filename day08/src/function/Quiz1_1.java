package function;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// 강사님방식의 풀이입니다!!
public class Quiz1_1 {
	static char getNearElebatorName(int[] arr, int currentFloor) {
		int min = 14;
		int index = 0;
		for(int i=0;i<arr.length;i++) {
			int diff = arr[i] - currentFloor;
			
			// 2) 차이에 절대값 처리하기(거리)
			if(diff < 0) {
				diff  = -diff;
			}
			
			// 3) 거리중 최솟값을 찾아서 index 구하기
			if(min > diff) {
				min = diff;
				index = i;
			}
			System.out.print(diff + " ");
		}
		System.out.println();
		return (char)(index + 'A');
	}
	
	// main
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int[] arr = new int[3];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = ran.nextInt(15) +1;
		}
		System.out.println(Arrays.toString(arr));
		
		int currentFloor=0;
		while(currentFloor < 1 || currentFloor > 15) {
			System.out.print("현재 층 수를 입력하세요 >> ");
			currentFloor = Integer.parseInt(sc.nextLine());
		}
		

		System.out.printf("%s 엘리베이터가 이동합니다. ",getNearElebatorName(arr,currentFloor));
	}
}
