package pow2array;

class Solution { 
	static int makeSize(int[] arr) {
		int size = 0;
    	if(arr!=null) {
    		size = arr.length;
    	}
    	if(arr.length==1) {
    		return 1;
    	}
    	int num2 = 2;
    	while(num2 < size) {
    		num2 = num2*2;
    	}
    	return num2;
	}
	
    public int[] solution(int[] arr) {
    	int index = makeSize(arr);
    	System.out.println("index : " + index);
    	
    	int[] answer = new int[index];
    	
    	for(int i=0;i<arr.length;i++) {
    		answer[i] = arr[i];
    	}
        return answer;
    }
}

public class Main {	
	public static void main(String[] args) {
		int[] arr = {1};
		for(int i=0;i<arr.length;i++) {
			arr[i] = i+1;
		}
		Solution s = new Solution();
		s.solution(arr);
	}
}
