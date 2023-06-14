package dividedNumArray;
// 나누어 떨어지는 숫자 배열

import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        int size = 0;
        for(int i =0; i<arr.length;i++) {
        	if(arr[i] % divisor == 0) {
        		size++;
        	}
        }
        if(size == 0) {
        	int[] answer = { -1 };
        	return answer;
        }
        int[] answer = new int[size];
        size = 0;
        for(int i =0; i<arr.length;i++) {
        	if(arr[i] % divisor == 0) {
        		answer[size] = arr[i];
        		size++;
        	}
        }
        Arrays.sort(answer);
        return answer;
    }
}

public class Main {
	public static void main(String[] args) {
		int[] arr = {3,2,6};
		int divisor = 5;
		Solution s = new Solution();
		System.out.println("answer : "+s.solution(arr, divisor));
	}
}
