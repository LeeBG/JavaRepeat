package nestedLoop;

public class Ex04 {
	
	static void showPostion() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("[%d, %d]", i, j);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	static void rightTriangle() {
		for(int i=0;i<5;i++) {
			for(int j = 0; j < 5; j++) {
				boolean flag=  (j+i)>=4;
				System.out.print(flag ? "* " : "  ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	static void rightTriangle2() {
		int space =4;
		int star =1;
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<space; j++) {
				System.out.print("  ");
			}
			for(int j=0;j<star; j++) {
				System.out.print("* ");
			}
			System.out.println();
			space -= 1;
			star += 1;
		}
		System.out.println();
	}
	// 횟수 조건
	static void ma1() {
		int star = 1;
		int space =2;
		
		for(int i=0;i<5;i++) {
			if(i <= 2) {
				for(int j=0;j<space;j++) {
					System.out.print("  ");
				}
				for(int j=space;j<space+star;j++) {
					System.out.print("* ");
				}
				System.out.println();
				
				if(i!=2) {
					space -= 1;
					star += 2;
				}
			}else {
				space += 1;
				star -= 2;
				for(int j=0;j<space;j++) {
					System.out.print("  ");
				}
				for(int j=space;j<space+star;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	}
	
	// 조건을 합쳐서 만드는 조건
	static void ma2() {
		for (int i = 0; i < 5; i++) { // 5줄
			for (int j = 0; j < 5; j++) {
				boolean flag = (i == 2 || j == 2) || (i%2 != 0 && j%2 !=0);
				System.out.print(flag ? "* " : "  ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		showPostion();
		rightTriangle();
		ma1();
		ma2();
			
	}
}
