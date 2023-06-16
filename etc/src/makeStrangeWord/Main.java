package makeStrangeWord;

// 이상한 문자 만들기
class Solution {
	public String solution(String s) {
		String answer = "";
		String[] e = s.split("");
		int index = 0;
		for(int i=0;i<e.length;i++) {
			if(e[i].equals(" ")) {
				index = 0;
			}else if(index % 2 == 0) {
				e[i] = e[i].toUpperCase();
				index++;
			}else if(index % 2 == 1) {
				e[i] = e[i].toLowerCase();
				index++;
			}
			answer += e[i];
		}
		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		s.solution("try hello world");
	}
}
