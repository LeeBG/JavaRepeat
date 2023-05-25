package function;

public class Ex03 {
	
	static int absolute(int num) {   // 부호 반전 메서드
		// 여기에 코드를 작성한다.
		int answer = 0;
		
		if(num < 0) answer = -num;
		else answer = num;
		return answer;
	}
	
	static double getCircleSize2(int radius) {		// Java.lang의 Math사용
		double circleSize = 0.0;
		double pi = Math.PI;
		
		circleSize = Math.pow(radius, 2.0) * pi;
		
		return circleSize;
	}
	
	static double getCircleSize(int radius) {
		double circleSize;
		double pi = 3.14;
		
		circleSize = pi * radius*radius;
		
		return circleSize;
	}
	
	// 더 큰 값
	static int getBigNumber(int n1, int n2) {
		return n2 > n1 ? n2 : n1;
	}
	
	
	// main 함수가 static 속성이므로 main에서 바로 호출하려면 static이여야한다.
	// static함수는 프로그램이 시작 후 종료할때까지 메모리에 있어서 바로 호출사용이 가능하다.
	public static void main(String[] args) {
		// 정수를 하나 입력받아서 정수의 절대값을 반환하는 함수
		// int를 하나 전달받아서, int 를 반환한다. ( 반환값은 하나만 가능)
		
		System.out.println("absolute(-3) : "+absolute(-3));
		System.out.println("absolute(3) : "+absolute(3));
		
		// 정수로 반지름을 전달받아서, 원의 넓이를 계산하여 반환하는 함수를 작성하세요
		System.out.println();
		System.out.println("PI를 3.14라고 정했을 때");
		double s1 = getCircleSize(3);
		double s2 = getCircleSize(4);
		
		System.out.printf("s1 : %.2f\n", s1);
		System.out.printf("s2 : %.2f\n", s2);
		
		
		System.out.println("==============");
		double s3 = getCircleSize2(3);
		double s4 = getCircleSize2(4);
		System.out.println("PI가 Math.PI 일 때");
		System.out.printf("s1 : %.2f\n", s3);
		System.out.printf("s2 : %.2f\n", s4);
		
		System.out.println();
		
		// 두 정수를 전달하여, 큰 값을 반환하는 함수를 작성하세요!!
		int n1 = getBigNumber(5,3);
		int n2 = getBigNumber(-5,3);
		
		System.out.println("n1 : "+n1);
		System.out.println("n2 : "+n2);
		System.out.println();
		
		
	}

}
