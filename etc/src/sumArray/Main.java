package sumArray;

// 행렬의 덧셈
class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
    	int max = 0;
    	int max2 = 0;
    	
    	if(arr1.length < arr2.length) {
    		max2 = arr2.length;
    	}else {
    		max2 = arr1.length;
    	}
    	
    	for(int[] a :arr1 ) {
    		if(a.length > max) {
    			max = a.length;
    		}
    	}
    	
    	for(int[] b : arr2) {
    		if(b.length > max) {
    			max = b.length;
    		}
    	}
    	
        int[][] answer = new int[max2][max];
        
        for(int i=0;i<max2;i++) {
        	for(int j=0;j<max;j++) {
        		answer[i][j] = arr1[i][j] + arr2[i][j];
        	}
        }
        
        return answer;
    }
}

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		int[][] arr1 = {
				{1,2},
				{2,3}
		};
		int[][] arr2 = {
				{3,4},
				{5,6}
		};
		s.solution(arr1, arr2);
	}
}
