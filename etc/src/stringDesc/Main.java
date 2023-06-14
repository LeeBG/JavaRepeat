package stringDesc;

import java.util.Arrays;

// 문자열 내림차순으로 정렬하기
class Solution {
	public String solution(String s) {
		String answer = "";
		char[] chars = s.toCharArray();
		Arrays.sort(chars);
		StringBuilder sb = new StringBuilder(new String(chars));
		answer = sb.reverse().toString();
		
		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		String st = "Zbcdefg";
		Solution s = new Solution();
		s.solution(st);
	}
}
