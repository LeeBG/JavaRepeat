package book;

public class Main {
	public static void main(String[] args) {
		new Handler();				// 새로운 Handler객체 생성!! 생성자 내부의 함수 종료시 종료됩니다.
													// 참조를 하는 변수가 없기 때문에 생성자가 종료되면 GC가 객체를 바로 소멸시킵니다.
	}
}
