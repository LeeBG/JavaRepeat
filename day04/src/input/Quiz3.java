package input;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		// 클래스 자료형이 import되지 않아서  빨간줄이 생겼다면
		// 클래스 가장 오른쪽에 커서를 두고 자동완성 (Ctrl + space)
		
		// 이름(문자열), 나이(정수), 키(실수),  몸무게(실수)로 입력받습니다.
		// 입력받은 값에서 체질량지수(BMI)를 구합니다.
		
		// bmi는 근육량, 유전적 원인, 개인적 차이를 반영하지 못하는 단점이 있습니다.
		// bmi = 몸무게 / 키^2
		// ~ 18.5 				저체중
		// 18.5 ~ 23 		정상
		// 23 ~ 25			과체중
		// 25 ~ 					비만
		
		// 단 bmi 지수는 소수점 이하 둘째자리까지 출력하면 됩니다.
		
		//1) 코드에서 사용할 변수를 상단에 한번에 선언한다.
		// 초기값을 지정할 수 있다면, 초기화한다.
		
		
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		double height, weight,bmi;
		
		// 2) 값이 할당되지 않은 변수 중에서 입력받아야 하는 값을 입력받는다.
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		
		System.out.print("키(cm)를 입력하세요 : ");
		height = sc.nextDouble();
		height /= 100.0;
		
		System.out.print("몸무게를 입력하세요 : ");
		weight = sc.nextDouble();
		
		bmi = weight / Math.pow(height,2);
		
		System.out.printf("%s님의 나이는 %d세이며, bim지수는 %.2f 입니다.\n",name,age,bmi);
		
		if(bmi<18.5) {
			System.out.println("저체중");
		}else if(bmi<23) {
			System.out.println("정상");
		}else if(bmi<25) {
			System.out.println("과체중");
		}else {
			System.out.println("비만");
		}
		
		sc.close();
	}
}
