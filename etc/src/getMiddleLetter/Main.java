package getMiddleLetter;

// 가운데 글자 가져오기
class Solution {
	public String solution(String s) {
		String answer = "";
		int length = s.length();
		
		if(s.length()%2==0) {	// 짝수 라면
			answer += s.charAt((length/2)-1);
			answer += s.charAt(length/2);
		}else {
			answer += s.charAt(length/2);
		}
		
		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		String answer = s.solution("qwer");
		System.out.println("answer : "+ answer);
	}
}
