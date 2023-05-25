package function;

public class Ex05 {
	public static void main(String[] args) {
		// 메인함수에서 실행되는 코드를 함수로 만들어보기
		// 1) 정수를 거꾸로 배치하여 반환하는 코드
		int num = 12345;
		int tmp = 0;
		
		while(num != 0) {
			tmp *= 10;
			tmp += num % 10;
			num /= 10;
		}
		System.out.println("tmp : " + tmp);			// 결과
		System.out.println("reverse : "+ reverse(13579));
	}

	static int reverse(int num) {	// 요인이 되는 값은 인자, 매개변수로 선언
		int tmp = 0;									// 코드 작성 내용은 사실상 메인함수와 동일하다.
		while(num != 0) {						// 여기서는 복붙으로 처리했음
			tmp *= 10;
			tmp += num % 10;
			num /= 10;
		}
		return tmp;				// 함수가 끝날 때 결과값을 return 하면 된다.
	}
}
