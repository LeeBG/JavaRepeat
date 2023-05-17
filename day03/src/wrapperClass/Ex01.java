package wrapperClass;

import java.util.*;

public class Ex01 {
	public static void main(String[] args) {
		// primitive type
		// boolean, byte, char, short, int, long, float, double
		
		// Wrapper class : 원시 자료형의 값을 형태로 저장하기 위해 사용하는 클래스
		// Boolean, Byte, Character, Short, Integer, Long, Float, Double
		
		byte by1 = 10;
		Byte by2 = 20;
		
		System.out.println("by1 :" + by1);
		System.out.println("by2 :" + by2);
		// 기본 자료형/Wrapper class 모두 값을 저장하는 데 이용할 수 있다.
		// Wrapper Class는 갑셍 대한 [기능], 자료형에 대한 [기능]이 내장되어 있다.
		
		// 자바의 객체 지향 언어 특징을 제대로활용하기 위해서 사용할 필요가 있다.
		
		// 1) 여러 정수가 포함된 배열에서 짝수만 골라내서 새로 담아서 출력하기;
		int[] arr = {7, 5, 4, 2, 8, 1, 9,  5};
		int[] arr2 = new int[3];
		
		int index = 0;
		for (int i = 0; i<arr.length;i++) {
			if(arr[i] % 2 == 0) {
				arr2[index++] = arr[i];
			}
		}
		System.out.println("arr2 = " + Arrays.toString(arr2));
		System.out.println();
		
		
		// 2) 객체 지향 특성을 활용하여 간단하게 처리하기
		Integer[] arr3 = {7, 5, 4, 2, 8, 1, 9, 5 };
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(arr3));
		System.out.println("list : " + list);
		list.removeIf(num -> num % 2 !=0);		// 만약 홀수 이면 리스트에서 제거한다.
		System.out.println("list : " + list);
		
		//(변수나 값이 아닌) Wrapper Class 자체에 내장된 기능을 활용하는 경우
		String s1 = "1234";
//		int num = (int)s1;	// 강제 형 변환도 자료형간의 호환성이 바탕이 되어야 한다.
		int num = Integer.parseInt(s1);
		System.out.println("s1 + 1 : "+(s1 + 1));
		System.out.println("num + 1 : " + (num  +  1));
		 
		}

}
