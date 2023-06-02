package sequenceAndIntervalQueries4;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int s = query[0];//0
            int e = query[1];//4
            int k = query[2];//1

            if(k==0){
                if(s == 0){
                    arr[0]++;
                    continue;
                }
            }
            if(e < arr.length){
                for(int i = s;i<e+1; i++){
                    if (i%k==0)
                        arr[i]+=1;
                }    
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}

public class Main {
	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 4, 3};
		int[][] queries = {
				{0,4,1},
				{0,3,2},
				{0,3,3}
		};
		Solution s = new Solution();
		s.solution(arr, queries);
	}
}
