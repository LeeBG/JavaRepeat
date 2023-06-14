package calculateTheShortfall;

// 부족한 금액 계산하기
class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long total = 0;
        for(int i=1;i<=count;i++) {
        	total += price*i;
        }
        
        if(money - total < 0) {
        	answer = total - money;
        }
        return answer;
    }
}

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		s.solution(3, 20, 4);
		// 3 6 9 12  = 30;
		// 금액이 부족하지 않다면 0리턴
	}
}
