package function;

import java.util.Arrays;
import java.util.Random;

public class Ex02 {
	static int maxOfAbs(int[] arr) {	// Math라이브러리를 사용한 버전
			// 절대값이 최대인 값을 찾아내기 
			// 절대값으로 구성된 새로운 배열을 만들기 위해
			int max = 0;
			int index = 0;
			for(int i=0;i<arr.length;i++) {
				if(Math.abs(arr[i]) >= max) {
					index = i;
					max = Math.abs(arr[i]);
				}
			}
			return index;
	}
	
	static int getMaxAbsIndex(int[] arr) {	// Math라이브러리를 사용하지 않은 버전
		int index = 0;
		
		int[] tmp = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int num = arr[i];
			
			if(num < 0) {
				num = -num;
			}
			
			tmp[i] = num;
		}
		
		int max = 0;
		for(int i = 0;i<tmp.length;i++) {
			if(max < tmp[i]) {
				max = tmp[i];
				index = i;
			}
		}
		return index;
	}
	
	public static void main(String[] args) {
		Random ran = new Random();
		int length = 5;
		int[] arr = new int[length];
		
		for(int i=0; i < arr.length;i++) {
			arr[i] = ran.nextInt() % 100;
		}
		
		
		System.out.println(Arrays.toString(arr));
		
		int result1 = maxOfAbs(arr);
		System.out.println("max : "+ arr[result1]);
		
		int result2 = getMaxAbsIndex(arr);
		System.out.println("절대값이 가장 큰 수 : "+ arr[result2]);
	}// end of main
	
	
}
