package iHateSameNum;
// 같은 숫자는 싫어
import java.util.*;

class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> arrStack = new Stack<Integer>();
        
        for(int i=0;i<arr.length;i++) {
        	if(arrStack.isEmpty() || (!arrStack.isEmpty() && arr[i] != arrStack.peek())) {
        		arrStack.push(arr[i]);
        	}
        }
        
        int[] answer = new int[arrStack.size()];
        
        for(int i=answer.length-1;i>=0;i--) {
        	answer[i] = arrStack.pop();
        }
 
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}

public class Main {
	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};
		int[] arr2 = {4,4,4,3,3};
		Solution s = new Solution();
		s.solution(arr);
		s.solution(arr2);
	}
}
