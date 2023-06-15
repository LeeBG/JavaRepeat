package reverseTernarySysten;

class Solution {
    public int solution(int n) {
        int answer = 0;
        String s_answer = "";
        while(n!=0) {
        	s_answer+=n%3;
        	n/=3;
        }
        StringBuilder sb = new StringBuilder(s_answer);
        sb.reverse();
        
        s_answer = sb.toString();

        for(int i=0;i<s_answer.length();i++) {
        	int num = Integer.valueOf(s_answer.charAt(i));
        	if(num-48 >= 0 && num-48 < 3) {
        		answer += (num-48) * (int)Math.pow(3, i);
        	}
        }
        
        return answer;
    }
}

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		s.solution(45);
	}
}
