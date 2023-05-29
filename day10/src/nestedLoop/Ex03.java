package nestedLoop;

public class Ex03 {
	static void showPostion() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("[%d, %d]", i, j);
			}
			System.out.println();
		}
		System.out.println();
	}

	// 직각 이등변 삼각형
	static void triangle() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j <= i) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	// X자
	static void X() {
		for (int i = 0; i < 5; i++) { // 5줄
			for (int j = 0; j < 5; j++) {
				boolean flag = (i == j) || (i + j == 4);
				System.out.print(flag ? "👨‍🦲 " : "  ");
			}
			System.out.println();
		}
	}

	// + 모양
	static void plus() {
		for (int i = 0; i < 5; i++) { // 5줄
			for (int j = 0; j < 5; j++) {
				boolean flag = (i == 2) || (j == 2);
				System.out.print(flag ? "* " : "  ");
			}
			System.out.println();
		}
	}

	// 정사각형
	static void rectangle() {
		for (int i = 0; i < 5; i++) { // 5줄
			for (int j = 0; j < 5; j++) {
				boolean flag = i%4==0 || j%4==0;
				System.out.print(flag ? "* " : "  ");
			}
			System.out.println();
		}
	}

	// 꽉찬 정 사각형
	static void basic() {
		for (int i = 0; i < 5; i++) { // 5줄
			for (int j = 0; j < 5; j++) {
				boolean flag = true;
				System.out.print(flag ? "* " : "   ");
			}
			System.out.println();
		}
	}


	
	public static void main(String[] args) {
		showPostion();
		triangle();
		X();
		plus();
		rectangle();
		basic();
	}
}
