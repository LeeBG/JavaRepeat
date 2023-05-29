package nestedArray;

public class Quiz2 {
	
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
		int size = 5;	// 그리는 한 변 사이즈
        int[][] arr = new int[size][size];
        
        int sign = 1; // 1부터 끝까지 증가하는 변수
        
        int right = -1;	// [0][-1]시작 
        int bottom = 0;
        int top = 1;
        
        for(int i=size; i>0; i--) {
        	//수평
            for(int j=0; j<size; j++) {
                right += top;
                arr[bottom][right] = sign;
                sign++;
            }
            
            size--;	// 5 4 3 2 1
            
            // 수직
            for(int j=0; j<size; j++) {
                bottom += top;
                arr[bottom][right] = sign;
                sign++;
            }            
            top = top * (-1);
        }
        
        show(arr);
	}
}
