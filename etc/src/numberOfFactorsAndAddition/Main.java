package numberOfFactorsAndAddition;

import java.util.Arrays;

// 약수의 갯수와 덧셈
class Solution {
	public int solution(int left, int right) {
		int answer = 0;	// 약수의 갯수로 연산을 한 값
		int[] counts = new int[right-left+1]; // 약수의 갯수를 담을 배열
		int count = 0;
		// 약수의 갯수를 배열에 담기
		for(int i=left;i<right+1;i++) {
			for(int j=1;j<i+1;j++) {
				if(i%j==0) {
					count++;
				}
			}
			counts[i-left]=count;
			count = 0;
		}
		
		for(int i=0;i<counts.length;i++) {
			if(counts[i] % 2 == 0)
				answer += (left+i);
			else
				answer -= (left+i);
		}
		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(13, 17));
		
	}
}
