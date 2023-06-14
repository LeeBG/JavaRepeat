package oddOrEven;

class Solution {
    public String solution(int num) {
        String answer = num % 2==0 ? "Even" : "Odd";
        return answer;
    }
}

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		s.solution(3);
	}
}
