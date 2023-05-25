package function;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Quiz1 {
	
	static char pushElvButton(int[] arr, int now) {
		char name = 65;		// 'A'
		Map< Integer,Character> elvMap = new HashMap<Integer, Character>();
		
		for(int i=0;i<arr.length;i++) {
			elvMap.put(arr[i],name);
			name+=1;
		}

		int sub = 0;			// 층 수의 차이
		int min = Integer.MAX_VALUE;
		int elv = 0;				// 차이가 가장 작은 층수
		
		for(int i=0;i<arr.length;i++) {
			sub = arr[i]-now;
			if(Math.abs(sub)<min) {
				min = Math.abs(sub);
				elv = arr[i];
			}
		}
		return elvMap.get(elv);
	}
	
	// main
	public static void main(String[] args) {
		
		// 3대의 엘리베이터가 있다.
		// 사용자에게 현재 층수를 입력받아서 가장 가까운 엘리베이터가 움직이도록 출력하세요
		// 처음부터 순서대로, 엘리베이터의 이름을 A, B, C라고 하면
		// "%s 엘리베이터가 이동합니다." 라고 출력해야 합니다.
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int [] arr = new int[3];
		
		// 1 ~ 15까지의 랜덤 숫자
		for(int i =0; i< arr.length; i++) {
			arr[i] = ran.nextInt(15)+1;
		}
		
		System.out.println(Arrays.toString(arr));
		
		int now = 0;
		while(now < 1 || now > 15) {
			System.out.print("지금 몇층에 계시나요? : ");
			now = Integer.parseInt(sc.nextLine());
		}	
		// 몇층에 있는 지 알아냈으니,
		// 엘리베이터 누른다
		System.out.printf("%s 엘리베이터가 작동합니다. \n",pushElvButton(arr, now));
		sc.close();
	}// end of main
}
