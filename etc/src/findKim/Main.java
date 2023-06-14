package findKim;
// 서울에서 김서방 찾기
class Solution {
    public String solution(String[] seoul) {
        String answer = "김서방은 %d에 있다";
        int index = 0;
        for(int i=0;i<seoul.length;i++) {
        	if(seoul[i].contains("Kim")) {
        		index = i;
        	}
        }
        System.out.println("index : "+index);
        answer=String.format(answer,index);
        
        return answer;
    }
}

public class Main {
	public static void main(String[] args) {
		String[] seoul = {"Jane","Kim"};
		Solution s = new Solution();
		System.out.println(s.solution(seoul));
	}
}
