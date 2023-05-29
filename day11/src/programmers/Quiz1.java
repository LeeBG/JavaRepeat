package programmers;

import java.util.Stack;

class Solution {
	static int[] high(int[][] board) {	 
		int[] high = {0,0,0,0,0};				// 가장 높이 있는 인형의 y값
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[i].length;j++) {
				if(board[i][j] != 0 && high[j] == 0) {
					high[j] = i;
				}
			}
		}
		return high;
	}
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> dollStack = new Stack<Integer>();
		int doll = 0;
		
		for(int i=0;i<moves.length;i++) {
			int index = moves[i]-1;
			int[] high_arr = high(board);							// 가장 높이 있는 y index를
			doll = board[high_arr[index]][index];
			
			// 인형을 담는다 (Stack에)
			if (doll!=0) {
				if(!dollStack.empty() && dollStack.peek().equals(doll)) {
					answer += 2;
					dollStack.pop();
				}else {
					dollStack.push(doll);
				}
			}
			// Stack에 담은 녀석은 0으로(빈 값)
			board[high_arr[index]][index] = 0;
		}
		return answer;
	}
}

public class Quiz1 {
	static void show(int[][] board) {
		for(int i=0;i<board.length;i++) {
			for(int j = 0; j<board[i].length;j++) {
				String s = "";
				switch(board[i][j]) {
				case 0:	s = "     ";	break;
				case 1:	s = "😎";	break;
				case 2:	s = "😀";	break;
				case 3:	s = "😁"; 	break;
				case 4:	s = "😋";	break;		
				case 5:	s = "😣";	break;
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		int [][] board = {
				{0, 0, 0, 0, 0},
				{0, 0, 1, 0, 3},
				{0, 2, 5, 0, 1},
				{4, 2, 4, 4, 2},
				{3, 5, 1, 3, 1},
		};
		int[] moves = {1 ,5, 3, 5, 1, 2, 1, 4};
		show(board);
		
		int answer = s.solution(board, moves);
		System.out.println(answer == 4 ? "정답" : "오답");
	}
}
