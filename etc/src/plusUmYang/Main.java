package plusUmYang;
// 음양더하기
class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int[] tmp = new int[absolutes.length];
        
        for(int i=0;i<absolutes.length;i++) {
        	if(signs[i]) {
        		tmp[i]=absolutes[i];
        	}else {
        		tmp[i]= -1 * absolutes[i];
        	}
        } 
        for(int n : tmp) {
        	answer += n;
        }
        return answer;
    }
}

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		int [] absolutes = {1,2,3};
		boolean[] signs = {false,false,true};
		s.solution(absolutes, signs);
		
	}
}
