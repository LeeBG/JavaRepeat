package greatestCommonFactorAndLeastCommonMultiple;

import java.util.Arrays;

// 최대 공약수와 최소 공배수
class Solution {
	public int gcf(int n, int m) {
		int r = 0;
		// m은 무조건 더 큰수로 친다.
		if (m < n) {
			int tmp = n;
			n = m;
			m = tmp;
		}
		while (m > 0) {
			r = n % m;
			n = m;
			m = r;
		}
		return n;
	}

	public int[] solution(int n, int m) {
		int[] answer = new int[2];

		answer[0] = gcf(n,m);
		
		answer[1] = n * m / answer[0];
		
		System.out.println("answer : "+Arrays.toString(answer));
		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		s.solution(6, 32);
	}
}
