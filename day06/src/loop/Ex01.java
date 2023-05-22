package loop;

public class Ex01 {
	public static void main(String[] args) {
		
		int num = 10;
		
		if (num< 20) {
			num += 1;
			System.out.println("if) num : " + num);
		}
		
		while(num < 20) {		// 조건이 참이면, 종속 문장을 실행하고
			num += 1;
			System.out.println("while) num : " + num);
		}		// 다시 조건절로 돌아가서 체크한다.
		
		while(num != 0) {
			num += 1;
			System.out.println("infinite loop) num : " + num);
			if (num == 10000){
				break;
			}
		} // 무한 반복이 걸리면 자원 소모가 크다.
		
		
		
	}
}
