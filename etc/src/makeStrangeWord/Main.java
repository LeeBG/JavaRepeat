package makeStrangeWord;

// 이상한 문자 만들기
class Solution {
	public String solution(String s) {
		String answer = "";
		s = s.toUpperCase();
		System.out.println(s);
		
		StringBuilder sb = new StringBuilder(s);
		for(int i=0;i<sb.length();i++) {
			if(i % 2 == 1 && (sb.charAt(i)<91 && sb.charAt(i)>64)) {
				 sb.setCharAt(i, (char) (sb.charAt(i)+32));
			}
			
		}
		answer = sb.toString();
		System.out.println(answer);
		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		s.solution("try hello world");
	}
}
