package squareRootDiscrimination;

class Solution {
	public long solution(long n) {
		long answer = -1;
		for(long i=1;i<=n;i++) {
			if(n / i == i && n % i == 0) {
				answer = (i+1) * (i+1);
				break;
			}
		}
		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		s.solution(101);
	}
}
