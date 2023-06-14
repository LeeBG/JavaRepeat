package convertStringtoNum;

class Solution {
    public int solution(String s) {
        int answer = 0;

        answer = Integer.parseInt(s);
        return answer;
    }
}

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		s.solution("-1234");
		s.solution("1234");
	}
}
