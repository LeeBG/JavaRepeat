package loop;

import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		// 탐색
		
		// 순차 탐색 (sequencial search) : 처음부터 순서대로 하나씩 값을 비교해 나가는 방식
		// 이진 탐색 (binary search) : 중간 값을 찾아가면서, 값의 범위를 좁혀나가는 방식
		
		System.out.println("순차탐색");
		Random ran = new Random();
		int cnt = 0;
		int min = 1;
		int max = 10000000;
		int answer = ran.nextInt(max) + 1;
		
		int seq = min;
		
		while(true) {
			cnt ++;
			if(seq == answer) {
				break;
			}
			seq ++;
		}
		
		System.out.printf("seq : %d, cnt : %d",seq, cnt);
	
		System.out.println("\n=========================");
		int bin = 0;
		cnt = 0;
		
		
		System.out.println("이진 탐색");
		while(true){
			bin = (min + max) / 2;			// 찾는 값은 (최솟값 + 최댓값) / 2
			cnt++;
			System.out.printf("bin : %d, cnt : %d\t",bin,cnt);
			
			if(bin > answer) {
				System.out.println("DOWN");
				max = bin;
			}else if(bin < answer){
				System.out.println("UP");
				min = bin;
			}else {
				break;
			}
		}
		System.out.printf("bin : %d, cnt %d ", bin, cnt);
		
	}
}
