package calcAverage;

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for(int i : arr) {
        	answer += (double)i;
        }
        answer/=arr.length;
        return answer;
    }
}
public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] arr = {5,5};
		s.solution(arr);
	}
}
