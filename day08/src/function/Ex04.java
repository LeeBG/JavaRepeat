package function;

public class Ex04 {
	// 절댓값
	 static int getAbsolute(int t1) {
//		 return t1 < 0 ? -t1 : t1;
		return Math.abs(t1);		// 함수안에서 함수호출이 가능하다
	}
	 // 가장 작은수
	static int getMinValue(int i, int j, int k) {
		return (i < j ? i : j) < k ? (i < j ? i : j) : k;
	}
	//  배열요소중 최소값
	static int getMinValue(int[] arr) {
		int min = arr[0];
		for(int i=1;i<arr.length;i++) {
			min = arr[i] < min ? arr[i] : min; 
		}
		return min;
	}
	public static void main(String[] args) {
		// 1) 정수를 하나 전달받아서 절대값을 반환하는 함수
		int t1 = getAbsolute(5 - 7);
		// 2) 세 정수를 전달받아서 최소값을 반환하는 함수
		int t2 = getMinValue(7, 2, 5);
		// 3) 길이가 3인 배열을 전달받아서 최소값을 반환하는 함수
		int[] arr = { 7, 2, 5 };
		int t3 = getMinValue(arr);

		// t2와 t3에서 함수이름이 똑같은데 이것은 함수가 받는 매개변수의 타입의 종류와 수가 다르기 때문에
		// 함수의 이름이 같아도 다른 함수이다.
		// 이것을 함수의 오버로딩이다. = 메서드 오버로딩
		// 구분기준 : 함수 이름 + 매개변수의 자료형, 갯수, 순서
		
		System.out.println("t1 : "+ t1);
		System.out.println("t2 : "+ t2);
		System.out.println("t3 : "+ t3);
	}
}
