package loop;

public class Ex01 {
	public static void main(String[] args) {
//					(1)		(2)	(4)
		for(int i=0;i<5;i++) {				
			System.out.println("Hello !!");	// 0, 1, 2, 3, 4
		}										//(3)
		// 1234234234...(false)
		System.out.println();
		
		int cnt = 0;
		while(cnt < 5) {
			System.out.println("java");
			cnt ++;
		}
		System.out.println();
	}
}
