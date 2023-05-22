package loop;

public class Ex06 {
	static int checkNumber(int num) {
		// F5 : Step into, 해당 함수 내부로 진입하여 디버깅을 계속 진행한다.
		// F6 : Step over, 해당 함수로 진입하지 않고, 함수의 결과만 받아서 계속 진행한다.
		
		String value = num + "";
		int answer = 0;
		
		for(int i =0; i< value.length(); i++) {
			char ch = value.charAt(i);
			if(ch == '3' || ch == '6' || ch=='9') {
				answer += 1;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		int num = 1;
		while(num <= 50) { // 1 ~ 50
			String value = num + "";
			
			if(value.contains("3") || value.contains("6")||value.contains("9")) {
				for (int i = 0; i<checkNumber(num);i++)
					System.out.print("✋");
				System.out.println();
			}else {
  				System.out.println(num);
			}
			num += 1;
		}
	}
}
