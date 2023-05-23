package array;

public class Ex09 {
	public static void main(String[] args) {
		// 배열은 Reference Type 이고, 그냥 출력하면 내부 데이터가 출력되지 않는다.
		int [] t1 = {};
		System.out.println("t1 : " + t1);
		// 배열의 값을 지정하여 생성하거나, 길이를 지정하여 생성할 수 있다.
		int[] t2 = { 10,30,20,40,50 };
		int[] t3 = new int[5];		// 길이 5짜리 빈 배열
		int[] t4 = new int[] {2,7,8,4,6};
//		int[] t5 = new int[5] {1,5,2,4,3};		// 둘 중 하나만 지정해야한다.
		
		String s1 = "Hello";
		String s2 = new String("Hello");
		
		// 길이를 지정해서 생성하면, 같은 자료형에 따라 0에 맞는 값으로 초기화된다.
		for(int i = 0;i < t2.length;i++) {
			System.out.print(t2[i] + " ");
		}
		System.out.println();
		
		for(int num : t3) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		
		// 자바의 참조 변수의 특성때문에 다르 배열을 가리킬 수 있다
		// 배열의 길이는 변할 수 없으나, 변수가 다른 배열을 가리키면서 길이가 바뀐것처럼 보일 수 있다.
		int [] t6 = {1, 2, 3};
//		t6[3] = 4;// 실행하면 예외 발생, 배변의 길이를 증가시킬수 없다.
		for(int num : t6) System.out.println(num + " ");
		System.out.println();
		
		t6 = new int[] { 1,2,3,4 };
		System.out.println(t6 + ": ");
		for(int num : t6) System.out.println(num + " ");
		System.out.println();
	}
}
