package array;

import java.util.Random;
import java.util.Arrays;

public class Quiz3 {
	public static void main(String[] args) {
			Random ran = new Random();
			int size = 10;
			int range = 100;
			int[] arr = new int[size];
			
		for(int i =0;i < arr.length; i++) {
			arr[i] = ran.nextInt(range); // 0 ~ 99사이의 임의의 수
		}
		// Arrays라는 유틸릴티 클래스를 import해서 배열의 내용을 문자열형태로 받아본다.
		
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		
		//1) arr의 값에서 홀수와 짝수가 각각 몇개인지 파악하여 출력하세요
		int oddcnt=0, evencnt = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % 2== 0) {
				evencnt ++;
			}else {
				oddcnt++;
			}
		}
		System.out.println("홀수의 갯수 : "+ oddcnt);
		System.out.println("짝수의 갯수 : "+ evencnt);
		
		
		// 2) oddArray와 evenArray를 생성하여 각각 홀수와 짝수를 담아서 출력하세요
		int [] evenArray = new int[evencnt];
		int [] oddArray = new int[oddcnt];
		
		int oddcnt1 = 0;
		int evencnt1 = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % 2 == 0) {
				evenArray[evencnt1] = arr[i];
				evencnt1++;
			}else {
				oddArray[oddcnt1] = arr[i];
				oddcnt1++;
			}
		}
		
		System.out.println("evenArray : "+Arrays.toString(evenArray));
		System.out.println("oddArray : "+Arrays.toString(oddArray));
		
		
		// 3) arr의 총 합을 구하여 출력하세요
		int total = 0;
		for(int i =0 ;i < arr.length;i++) {
			total += arr[i];
		}
		
		System.out.println("total : "+total);
		
	}
}
