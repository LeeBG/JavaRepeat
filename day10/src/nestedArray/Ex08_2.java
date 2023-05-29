package nestedArray;

public class Ex08_2 {
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
		int[][] arr = new int[5][5];
		int num = 1;
		int x = 0, y = 0;

		arr[0][0] = num++; // x값이 홀수이면
		arr[1][0] = num++;
		arr[2][0] = num++;
		arr[3][0] = num++;
		arr[4][0] = num++;

		arr[4][1] = num++;
		arr[3][1] = num++;
		arr[2][1] = num++;
		arr[1][1] = num++;
		arr[0][1] = num++;

		arr[0][2] = num++;
		arr[1][2] = num++;
		arr[2][2] = num++;
		arr[3][2] = num++;
		arr[4][2] = num++;

		arr = new int[5][5];
		num = 1;
		
		for(int i = 0;i<5;i++) {
			for(int j = 0; j < 5; j++) {
				if(i % 2 == 0) arr[j][i] = num++;
				else					arr[4-j][i] = num++;
			}
		}
		show(arr);
	}
}
