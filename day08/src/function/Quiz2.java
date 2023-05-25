package function;

public class Quiz2 {
	public static void main(String[] args) {
		String s1 = quiz1(12); // 48분
		String s2 = quiz1(16); // 1시간 4분

		String s3 = quiz2(25); // 3,000원
		String s4 = quiz2(40); // 3,500원
		String s5 = quiz2(41); // 4,000원

		int n1 = quiz3(1, 10);
		int n2 = quiz3(10, 1);
		int n3 = quiz3(10,10); // 같을 때
		int n4 = quiz3_1(1, 10);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
	}

	static String quiz1(int n1) {
		int time = n1 * 4;
		String result = "";
		if(time/60 == 0) {
			result = time+"분";
		}else {
			result = (time/60)+"시간 "+(time%60)+"분";
		}
		return result;
	}

	static String quiz2(int time) {
		int total_fee = 3000;
		if(time>30) {
			total_fee += ( (time-21) / 10 )*500;
		}
		return String.format( "%d분 요금은 %,d원 입니다.", time,total_fee);
	}

	static int quiz3(int n1, int n2) {
		int sum = 0;
		int i = n1;
		if(n1 < n2) {
			for(;i<n2+1;i++) {
				sum += i;
			}
		}
		else { // 인덱스 감소시키면서 더함
			for(;i>=n2;i--) {
				sum += i;
			}
		}
		return sum;
	}
	// 두번째 방법
	static int quiz3_1(int n1, int n2) {
		// 등차수열의 공식을 잘 써먹자
		int answer= (n1 + n2) * (Math.abs(n1-n2)+1) / 2;
		return answer;
	}
}
