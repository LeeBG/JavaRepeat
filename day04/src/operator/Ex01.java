package operator;

public class Ex01 {
			//논리 연산자 : %%, ||, !
			// boolean 타입의 값을 연산한다.
			// && : and, 서로 다른 두 조건이 모두 true이면 true를 나타낸다.
			// || : or, 서로 다른 두 조건 중 하날도 true이면 true를 나타낸다.
			// ! : not, 단항 연산자이며 true는 false로 바꾸고, false는 true로 바꾼다.
			
	public static void main(String[] args) {
		boolean bo1 = true;
		boolean bo2 = false;
		
		System.out.println("bo1 && bo2 : " + (bo1 && bo2));
		System.out.println("bo1 %% true : "+(bo1&&true));
		System.out.println("bo1||bo2 : "+(bo1||bo2));
		System.out.println("false || bo2 : " + (false || bo2 ));
		System.out.println();
		// 서로 다른 두 조건을 만족한다면 true
		// 예를 들어, 성별이 남성이고 나이가 20세 이상인 경우에만 true
		String gender = "남성";
//		gender = "여성";
		int age = 25;
		
		boolean flag1 = gender.equals("남성") && age >= 20;	// 군대징집조건
		
		System.out.println("flag1 : " + flag1);
		
		// 서로 다른 두 조건 중 하나라도 만족하면 true	
		// 현금이 5천원 이상 있거나, 카드를 가지고 있다면 true ||
		
		int cash = 1000;
		boolean hasCard = false;
		
		boolean flag2 = cash >= 5000 || hasCard == true;
		System.out.println("flag2 : "+ flag2);
		
		// 기존 조건의 반대 경우를 나타내고  싶을 때 !를 붙여준다.(논리 반전 연산자  not)
		System.out.println("!flag1 : "+ !flag1); // 군 면제의 경우
		System.out.println();
		
		// 현재 상태를 계속 바꿔치기(리모컨) 
		
		boolean tvPower = false;
		System.out.println("tvPower : "+tvPower);
		tvPower = !tvPower;
		
		System.out.println("tvPower : "+tvPower);
		tvPower = !tvPower;
		
		System.out.println("tvPower : "+tvPower);
		tvPower = !tvPower;
		
		System.out.println("tvPower : "+tvPower);
	}
}
