package qrCode;

class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        for(int i=0;i<code.length();i++) {
        	if(i%q==r) {
        		answer += code.charAt(i);
        	}
        }
        return answer;
    }
}

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		s.solution(3, 1, "qjnwezgrpirldywt");
	}
}
