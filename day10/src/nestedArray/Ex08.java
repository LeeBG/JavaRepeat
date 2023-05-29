package nestedArray;

public class Ex08 {
	static void show(int [][] arr) {
		for(int i = 0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("%2d ",arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
			int [][] arr = new int[5][5];
			show(arr);
			
			int num=1;
			for(int i=0;i<arr.length;i++) {
				for(int j = 0;j<arr[i].length;j++) {
					arr[i][j] = num++;
				}
			}
			show(arr);
			
			num =1;
			for(int i = 0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					arr[j][i] = num++;
				}
			}
			show(arr);
			
			
			num = 1;
			for(int i =0;i<arr.length;i++) {
				for(int j = 0;j<arr[i].length;j++) {
					if(i % 2 == 0) {
						arr[i][j] = num++;
					}
					else {
						arr[i][4-j] = num++;
					}
				}
			}
			show(arr);
			
			
			num = 1;
			for(int i =0;i<arr.length;i++) {
				for(int j = 0;j<arr[i].length;j++) {
					if(i % 2 == 0) {
						arr[j][i] = num++;
					}
					else {
						arr[4-j][i] = num++;
					}
				}
			}
			show(arr);
			
			
			num = 1;
			for(int i =0;i<arr.length;i++) {
				for(int j = 0;j<arr[i].length;j++) {
					if(i % 2 == 0) {
						arr[j][i] = 26 - num++;
					}
					else {
						arr[4-j][i] =26 - num++; 
					}
				}
			}
			show(arr);
			
			
			num = 1;
			for(int i =0;i<arr.length;i++) {
				for(int j = 0;j<arr[i].length;j++) {
					if(i % 2 == 0) {
						arr[i][j] = 26 - num++;
					}
					else {
						arr[i][4-j] = 26- num++;
					}
				}
			}
			show(arr);
			
			
			num = 1;
			for(int i =arr.length-1;i>=0;i--) {
				for(int j = arr[i].length-1;j>=0;j--) {
					if(i % 2 == 0) {
						arr[i][j] =  num++;
					}
					else {
						arr[i][4-j] = num++;
					}
				}
			}
			show(arr);
			
			num = 1;
			for(int i =arr.length-1;i>=0;i--) {
				for(int j = arr[i].length-1;j>=0;j--) {
					if(i % 2 == 0) {
						arr[j][i] =  num++;
					}
					else {
						arr[4-j][i] = num++;
					}
				}
			}
			show(arr);
			
	}
}
