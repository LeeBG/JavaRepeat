package addMissingNumbers;

// 없는 숫자 더하기
class Solution {
	public int solution(int[] numbers) {
		int answer = 0;
		
		for(int i=1;i<10;i++) {
			for(int j=0;j<numbers.length;j++) {
				if(numbers[j]==i) {
					break;
				}
				if(j==(numbers.length-1)) {
					answer += i;
				}
			}
		}
		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		int [] arr = {1,2,3,4,6,7,8,0};
		s.solution(arr);
	}
}
