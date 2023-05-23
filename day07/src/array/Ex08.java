package array;

public class Ex08 {
	public static void main(String[] args) {
		int n1 = -5, n2 = 12, n3 = 4;
		int max;
		
		max = n1;
		
		if(max < n2) {
			max = n2;
		}
		if(max < n3) {
			max = n3;
		}
		System.out.println("max : " + max);
		
		
		
		int [] arr = {17 ,26,33 ,52, 46, 87, 69, 92,73 };
		max = 0;
		for(int i= 0; i< arr.length;i ++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("max : "+ max);
		System.out.println();
		
		max = 0;
		
		// 1) arr의 값 중에서, 홀수이면서 가장 큰 값을 찾아서 출력하세요
			for(int i : arr) {
				if(max < i && i %2 !=0) {
					max = i;
				}
			}
			System.out.println("홀수이면서 가장 큰 값 : " + max);
		// 2) arr의 값 중에서, 짝수인 값의 합계를 구하여 출력하세요
		int sum =0;
		for(int i:arr) {
			if(i % 2 == 0)
				sum += i;
		}
		System.out.println("짝수인것들의 합 : "+sum);
		// 3) arr의 모든 값의 평균을 구하여 소수점 둘째자리까지 출력하세요
		sum = 0;
		double avg = 0.0;
		for(int i : arr) {
			sum += i;
		}
		avg = sum / arr.length;
		System.out.printf("평균 : %.2f\n",avg);
	}
}
