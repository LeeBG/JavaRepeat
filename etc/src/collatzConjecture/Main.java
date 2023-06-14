package collatzConjecture;
// LV1 콜라츠 추측
class Solution {
    public int solution(int num) {
        int answer = -1;
        int count = 0;
        
        long num2 = (long)num;
        
        while(num2 != 1) {
        	if(num2 % 2 == 0) {	// 짝수이면
        		num2 /= 2;
        	}else {				// 홀수이면
        		num2 = num2*3 + 1;
        	}
        	count++;	
        }
        
        if(count < 500) {
        	answer = count;
        }      
        
        return answer;
    }
}


public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		int answer = s.solution(626331);
		System.out.println("answer : "+answer);
	}
}
