package loop;

public class Quiz2 {

	// 합산 무적 합산
	public static void main(String[] args) {
		// 1부터 100사이의 정수를 반복하여 
		// 홀수의 합과 짝수의 합을 각각 구하여 출력하세요
		
		int sum_odd=0,sum_even=0,num=1;
		
		while(num <= 100) {
			if(num % 2 == 0) {
				sum_even += num;
			}else {
				sum_odd += num;
			}
			num ++;
		}
		System.out.println("홀수의 합 : "+ sum_odd);
		System.out.println("짝수의 합 : "+ sum_even);
	}
}
