package twoIntegerSum;

class Solution {
	public long solution(int a, int b) {
		long answer = 0;
		if(a < b) {
			for(int i=a;i<=b;i++) {
				answer += (long)i;
			}
		}else {
			for(int i=b;i<=a;i++) {
				answer += (long)i;
			}
		}
		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println("answer(3,5) : "+s.solution(3, 5));
		System.out.println("answer(5,3) : "+s.solution(5, 3));
		System.out.println("answer(5,3) : "+s.solution(3, 3));
	}
}
