package nestedArray;

public class Quiz1 {
	static void show(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int size = 5;

		int[][] arr = new int[size][size];
		
		// 주의!!) 이 코드는 5x5기준으로만 짠 코드 (55기준으로만 규칙 찾음)
		// 6x6이나 7x7은 다른 알고리즘을 통해 해결

		// 다음 형태로 출력하세요
		// 1 2 3 4 5
		// 16 17 18 19 6
		// 15 24 25 20 7
		// 14 23 22 21 8
		// 13 12 11 10 9
		int num = 1;
		int max = size;		// 배열 1줄의 최대 요소 갯수
		while (size != 0) {
			if (size == max) {								// size 5
				for (int i = 0; i < size; i++) {
					arr[0][i] = num++;
				}
			} else if (size % 2 == 0) {						// size 2 or 4일떄
				// 수직
				for (int i = 0; i < size; i++) {
					arr[i + (size%3)][max-(size%3)] = num++;
				}
				// 수평
				for (int i=0; i<size;i++) {
					arr[max-(size%3)][max-(size%3)-i-1] = num++;
				}	
			}
			else if (size % 2 == 1 && size != max) {		// size 1 or 3일때
				// 수직
				for(int i=0;i<size;i++) {
					arr[(max-(max-size)/2)-i-1][size%3]=num++;
				}
				// 수평
				for(int i=0;i<size;i++) {
					arr[(max-size)/2][i+(max-size)/2] = num++;
				}	
			}
			size--;
		} // end of while
		show(arr);
	} // end of main
}// end of class
