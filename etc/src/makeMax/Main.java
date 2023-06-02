package makeMax;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        return answer;
    }
}

public class Main {
	public static void main(String[] args) {
		// 배열의 소들 중에서 둘을 곱해 최대값을 만들기
		int[] arr = {0, 31, 24, 10, 1, 9};
		int max = 0; 
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]*arr[j] > max) {
					max = arr[i]*arr[j];
					System.out.println("max = "+max);
				}
			}
		}
		System.out.println(max);
	}
}
