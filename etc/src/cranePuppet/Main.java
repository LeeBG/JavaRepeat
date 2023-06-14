package cranePuppet;

import java.util.ArrayList;

class Solution {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		ArrayList<Integer> basket = new ArrayList<Integer>();

		for (int i = 0; i < moves.length; i++) {
			int index = moves[i] - 1;
			// index번째 인형을 꺼낸다.
			for (int j = 0; j < board.length; j++) { // 인형이 담긴 통은 N x N
				if (board[j][index] != 0) {
					int size = basket.size();
					if (size >= 1 && board[j][index] == basket.get(size - 1)) {
						basket.remove(size - 1);
						answer += 2;
					} else {
						basket.add(board[j][index]); // 꺼낸 인형을 바구니에 넣는다
					}
					board[j][index] = 0;
					break;
				}
			}
		}
		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, {0, 2, 5, 0, 1 },{4, 2, 4, 4, 2 }, {3,5,1,3,1} };
		int[] moves = {1,5,3,5,1,2,1,4}; 
		System.out.println(s.solution(board, moves));
	}
}
