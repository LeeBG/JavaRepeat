package pAndy;

class Solution {
	boolean solution(String s) {
		boolean answer = true;
		String removeP = s.replaceAll("p", "").replaceAll("P", "");
		String removeY = s.replaceAll("y", "").replaceAll("Y", "");
		if(removeP.length()!=removeY.length())
			answer=false;
		
		System.out.println(answer);
		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		s.solution("pPoooyY");
	}
}
