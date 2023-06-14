package runningRace;

import java.util.*;

class Solution {
	public String[] solution(String[] players, String[] callings) {
		Map<String, Integer> playersmap = new HashMap();
		for (int i = 0; i < players.length; i++)
			playersmap.put(players[i], i + 1);
		for (int i = 0; i < callings.length; i++) {
			String temp = "";
			temp = players[playersmap.get(callings[i]) - 2];
			players[playersmap.get(callings[i]) - 2] = players[playersmap.get(callings[i]) - 1];
			players[playersmap.get(callings[i]) - 1] = temp;

			playersmap.put(callings[i], playersmap.get(callings[i]) - 1);
			playersmap.put(temp, playersmap.get(temp) + 1);

		}
		return players;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		String[] players = {"mumu", "soe", "poe", "kai", "mine"};
		String[] callings = {"kai", "kai", "mine", "mine"};
		System.out.println(Arrays.toString(s.solution(players, callings)));
	}
}
