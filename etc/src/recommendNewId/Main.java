package recommendNewId;

class Solution {
	public String solution(String new_id) {
		String answer = "";
		answer = new_id;
		// 1단계
		answer = answer.toLowerCase();

		// 2단계
		for (int i = 0; i < answer.length(); i++) {
			if (answer.charAt(i) > 96 && answer.charAt(i) < 123) {
				// 소문자
				continue;
			} else if (answer.charAt(i) >= 48 && answer.charAt(i) < 58) {
				continue;
			} else if (answer.charAt(i) == 45 || answer.charAt(i) == 95 || answer.charAt(i) == 46) {
				continue;
			} else {
				answer = answer.replace(String.valueOf(answer.charAt(i)), "");
				i--;
			}
		}

		// 3단계
		for (int i = 0; i < answer.length(); i++) {
			if (answer.contains("..")) {
				answer = answer.replace("..", ".");
			}
		}

		// 4단계
		while (answer.indexOf('.') == 0) {
			answer = answer.substring(1);
		}

		while (answer.length() > 0 && answer.charAt(answer.length() - 1) == 46) {
			if (answer.length() - 1 > 0) {
				answer = answer.substring(0, answer.length() - 1);
			} else {
				answer = "";
			}
		}

		// 5단계
		if (answer.isEmpty()) {
			answer += "a";
		}

		// 6단계
		if (answer.length() >= 16) {
			answer = answer.substring(0, 15);
		}
		// 4번 카피(끝자리 .검사)
		while (answer.length() > 0 && answer.charAt(answer.length() - 1) == 46) {
			answer = answer.substring(0, answer.length() - 1);
		}

		// 7단계
		char ch = answer.charAt(answer.length() - 1);
		while (answer.length() < 3) {
			answer += ch;
		}

		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution("...!@BaT#*..y.abcdefghijklm"));
	}
}
