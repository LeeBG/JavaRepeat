package harshadNumber;
//하시드 숫자
class Solution {
    public boolean solution(int x) {
    	String[] arr = String.valueOf(x).split("");
    	boolean answer = false;
    	int sum = 0;
    	for(String e : arr) {
    		sum += Integer.parseInt(e);
    	}
    	if(x % sum == 0) answer =true;
        
        return answer;
    }
}

public class Main {
	public static void main(String[] args) {
		System.out.println(new Solution().solution(11));
	}
}
