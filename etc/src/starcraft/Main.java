package starcraft;

import starcraft.maps.Map;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Player player1 = new Player("red", "저그", "이제동");
		Player player2 = new Player("blue", "테란", "정명훈");
		Map map = new Map("이클립스", 128, 112, 2);		// 2인용 맵 
		
		Starcraft star = new Starcraft(player1, player2, map);
		star.startGame();
	}
}
