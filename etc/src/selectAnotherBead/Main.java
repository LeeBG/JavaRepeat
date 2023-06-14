package selectAnotherBead;

// 구슬을 나누는 경우의 수

class Solution {
    public long solution(int balls, int share) {
        int answer = 0;
        int[] bunza = new int[balls-share];
        int[] bunmo = new int[balls-share];		
        
        if(balls == share) {
        	return 1;
        }
        
        int value = share+1;
        
        // 분자 부분
        for(int i = 0; i < bunza.length; i++) {
        	bunza[i] = value;
        	value++;
        }
        
        
        // 분모 부분
        for(int i = 0;i < bunmo.length; i++) {
        	bunmo[i] = i+1;
        }

        // 분자의 약수가 분모 라면 나누기
        for(int i=0;i<bunmo.length;i++) {
        	for(int j=0;j<bunza.length;j++) {
        		if(bunza[j] % bunmo[i] == 0) {
        			bunza[j] = bunza[j]/bunmo[i];
        			bunmo[i] = 1;
        			break;
        		}
        	}
        } 

        long a=1,b=1;
        for(int i=0;i<bunmo.length;i++) {
        	a *= bunza[i];
        	b *= bunmo[i];
        } 
     
        answer = Long.valueOf(a / b).intValue();

        return answer;
    }
}

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println("answer : " + s.solution(3, 2));
	}
}
