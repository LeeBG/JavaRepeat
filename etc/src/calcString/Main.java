package calcString;

import java.util.Arrays;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        return answer;
    }
}

public class Main {
	public static void main(String[] args) {
		String my_string = "1 + 2 - 3 - 4";
		String[] arr = my_string.split(" - ");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		if(arr[0].contains("+")) {
			System.out.println("여기서 멈춤");
		}
		Solution s = new Solution();
		s.solution(my_string);
	}
}
