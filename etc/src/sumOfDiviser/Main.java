package sumOfDiviser;

// 약수의 합 리턴하기
class Solution {
    public int solution(int n) {
    	int answer = 0;
        for(int i=1;i<=n;i++) {
        	if(n % i == 0) {
        		answer += i;
        	}
        }
        return answer;
    }
}

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		int n = 5;
		
		s.solution(n);
	}
}
