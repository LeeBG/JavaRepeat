package loop;

public class Ex03 {
	public static void main(String[] args) {
		int odd=0,even=0;
		// 1) 1부터 100 사이의 홀수의 합과 짝수의 합을 for문으로 계산하여 출력하세요
		for(int i = 1;i<=100;i++) {
			if(i % 2== 0) {
				even += i;
			}
			else {
				odd += i;
			}
		}
		System.out.println("짝수 : "+even);
		System.out.println("홀수 : "+odd);
		
		// 2) A부터 Z까지 띄어쓰기로 구분하여 한줄에 출력하세요
		for(int i = 65;i<91;i++) {
			System.out.printf("%c ",i);
		}
		System.out.println();
		
		// 3) 빈 문자열에 * 기호를 5번 추가하여 출력하세요
		String str = "";
		for(int i=0;i<5;i++) {
			str += "*";
		}
		System.out.println(str);
		
	}
}
