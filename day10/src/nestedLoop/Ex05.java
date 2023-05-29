package nestedLoop;

public class Ex05 {
	public static void main(String[] args) {
		int num = 1;
		int k;
		
		// 얘를  뒤집으세요
		for(int i = 0;i<5;i++) {
			for(int j = 0; j<5;j++) {
				int num1 = j * 5 + i +1;
				System.out.printf("%2d ",num1);
			}
			System.out.println();
		}
		System.out.println();
		
		
		// 방법 1
		for(int i=0;i<5;i++) {
			k = num;
			for(int j=0;j<5;j++) {
				System.out.printf("%2d ",k);
				k = k + 5;				// 칸마다 5씩 증가시키고 싶고
			}
			num +=1;				// 줄마다 1씩 증가 시키고 싶다.
			System.out.println();
		}
		System.out.println();
		
		
		// 방법 2
		for(int i = 0;i<5;i++) {
			for(int j = 0; j<5;j++) {
				int num1 = j * 5 + i +1;
				System.out.printf("%2d ",num1);
			}
			System.out.println();
		}
	}
}
