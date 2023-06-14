package removeMin;
// 제일 작은 수 제거하기
class Solution {
    public int[] solution(int[] arr) {
    	if(arr.length==1) {
    		int[] answer = {-1};
    		return answer;
    	}
        
        int min = Integer.MAX_VALUE;
        int index = 0;
        // 최솟값 구하기
        for(int i=0;i<arr.length;i++) {
        	if(arr[i] < min) {
        		min = arr[i];
        	}
        }
        // 최솟값 갯수 제외한 배열 사이즈 구하기
        for(int i=0;i<arr.length;i++) {
        	if(arr[i] != min) {
        		index++;
        	}
        }
        // 배열사이즈 만큼 배열만들어서
        int[] answer = new int[index];
        index = 0;
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]!=min) {
        		answer[index] = arr[i];
        		index++;
        	}	
        }    
        
        return answer;
    }
}

public class Main {
	public static void main(String[] args) {
		int[] arr = {1,4,3,2,1};
		Solution s = new Solution();
		s.solution(arr);
	}
}
