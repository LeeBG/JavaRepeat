package loop;

public class Ex02 {
	public static void main(String[] args) {
		// 일정한 횟수 만큼 반복하기
		
		int cnt = 0;						// 반복 변수 선언 및 초기화
		
		while(cnt < 5) {			// 반복을 수행할 조건
			System.out.println("["+(cnt+1) + "] Hello World !!"); // 실질적인 종속문장
			cnt++;							// 증감식
		}
		
		System.out.println("반복 종료");
		System.out.println();
		
		// 변수 선언 및 초기화; 반복조건; 증감식
		for(int i=0;i<5;i++) {
			System.out.println("Hello java");	// 종속 문장
		}
		System.out.println("for 종료");
	}
}

