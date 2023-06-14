package n_numbersInteval_x;

// n을 시작으로 n씩 증가하는 숫자를 담은 배열의 크기가 x개 인 배열을 리턴 
class Solution {
	public long[] solution(int x, int n) {
		long x1 = x;								// 형변환의 중요성
		long[] answer = new long[n];		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = x1 * (i + 1);
		}		
		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		s.solution(2, 5);
	}
}
