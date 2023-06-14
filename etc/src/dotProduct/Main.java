package dotProduct;
// 내적
class Solution {
	public int solution(int[] a, int[] b) {
		int answer = 0;
		for(int i=0;i<a.length;i++) {
			answer += a[i]*b[i];
		}
		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		int [] a = {1,2,3,4};
		int [] b = {-3,-1,0,2};  
		int answer = s.solution(a,b);
		System.out.println("answer: "+answer);
	}
}
