package wrapperClass;

public class Ex03 {
	public static void main(String[] args) {
		/*
		 * 	사용자의 입력값은 주로 키보드를 통해서 들어오기 때문에 String타입으로 나타낸다.
		 * 	사용자가 입력한 값을 숫자로 계산해야 한다면 형 변환이 필요하다.
		 *		이 때, String을 곧바로 int나 double로 변환할 수는 없다.
		 *		따라서, Wrapper Class의 parse 함수를 사용할 수 있다. 
		 */
		
		String s1 = "1234";
		String s2 = "3.14";
		String s3 = "true";
		
		
//		int v1 = s1;
		int v1 = Integer.parseInt(s1);
		
//		double v2 = s2;
		double v2 = Double.parseDouble(s2);
		
//		boolean v3 = s3;
		boolean v3 = Boolean.parseBoolean(s3);
		
		System.out.println("v1 : "+ v1);
		System.out.println("v2 : "+v2);
		System.out.println("v3 : "+v3);
		
		System.out.println();
		
		System.out.println("v1+1 : "+ (v1+1));
		System.out.println("v2+1 : "+(v2+1));
		System.out.println("!v3 : "+ !v3);
	}
}	
