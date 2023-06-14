package addDigits;

class Solution {
	public int solution(int n) {
		int answer = 0;
		while(n!=0) {
			answer += n%10;
			n/=10;
		}
		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		s.solution(987);	// n은 1억 이하의 자연수
	}
}
