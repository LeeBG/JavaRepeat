package stringHandlingBasic;
// 문자열 다루기 기본
class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        int count = 0;
        for(int i=0;i<s.length();i++) {
        	if(s.charAt(i) >= 48 && s.charAt(i) <= 57) {
        		count ++;
        	}
        }
        if(count == s.length() && (s.length() ==4 || s.length() == 6))
        	answer = true;
        else
            answer = false;
        return answer;
    }
}

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		
		System.out.println(s.solution("123123aslk"));
	}
}
