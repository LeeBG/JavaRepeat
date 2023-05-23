package loop;

public class Ex04 {
	public static void main(String[] args) {
		int mul = 3;
		
		System.out.printf("%d x %d = %2d\n",3,1,3*1);
		System.out.printf("%d x %d = %2d\n",3,1,3*2);
		System.out.printf("%d x %d = %2d\n",3,1,3*3);
		System.out.printf("%d x %d = %2d\n",3,1,3*4);
		System.out.printf("%d x %d = %2d\n",3,1,3*5);
		System.out.printf("%d x %d = %2d\n",3,1,3*6);
		System.out.printf("%d x %d = %2d\n",3,1,3*7);
		System.out.printf("%d x %d = %2d\n",3,1,3*8);
		System.out.printf("%d x %d = %2d\n",3,1,3*9);
		
		System.out.println();
		
		for(int i =1;i<10;i++) {
			System.out.printf("%d x %d = %2d\n",mul,i,mul*i);	
		}
		System.out.println();
		//  위 코드를 for문을 이용하여 새로 작성해보세요
		// 필요한 변수가 있다면 추가로 선언해도 된다.
	}
}
