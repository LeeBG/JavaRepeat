package loop;

public class Ex05 {
	public static void main(String[] args) {
		int cnt = 0;
		
		while(cnt < 100) {	// 0 1 2 3 4 5 6 7 8 9 
			if(cnt % 3 == 0) {	// [0], [3], [6], [9]
				System.out.print("["+cnt + "] ");
			}
			cnt ++;
		}
		System.out.println();
	}
}
