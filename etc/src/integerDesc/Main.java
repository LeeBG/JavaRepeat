package integerDesc;
// 정수 내림차순
import java.util.Arrays;

class Solution {
    public long solution(long n) {
    	String[] n_list = String.valueOf(n).split("");
    	Arrays.sort(n_list);
    	
    	long answer = 0;
    	StringBuilder sb = new StringBuilder();
    	for(String e : n_list) {
    		sb.append(e);
    	}
        answer = Long.parseLong(sb.reverse().toString());
        return answer;
    }
}

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		long result = s.solution(118327);
		System.out.println(result);
	}
}
