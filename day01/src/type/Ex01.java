package type;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("Hello");
		
		/*
		 * 	type : 데이터의 유형, 자료형 (data type)
		 * 	
		 */
		
		int t1  = 44032;
		char t2 = '가';
		
		System.out.println(Integer.toBinaryString(t1));
		System.out.println(Integer.toBinaryString((int)t2));
		System.out.println();
		System.out.println(t1);
		System.out.println(t2);
		
		/* Java Data Type
		
		 1) primitive type
		 객체가 아닌 값을 나타내기 위한 자료형. 기본적인 유형의 값을 나타낸다.
		 자료형의 글자가 모두 소문자로 되어있다.
		 byte(1, -128 ~  +127)
		 boolean(1, true/false ) 
		 char(2, 0 ~ 65535)
		 short(2, -32768 ~ + 32767 ) 
		 int(4, -21억 ~ + 21억)
		 long(8, -922경 ~ + 922경), 
		 float(4, 실수), 
		 double(8, 실수)
		 기본(원시) 자료형은 값을 변수에 직접 저장한다.
		
		2) Reference Type
		 2-1) Array Type : 배열, 모든 배열유형은 참조방식이다.
		 2-2) Class Type : 클래스에 의해 만들어진 객체, 객체는 참조방식이다.
		 레퍼런스 타입은 대상을 가리키는 형식이다.
		 * 
		 */
	}
}
