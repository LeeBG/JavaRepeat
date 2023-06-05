package starcraft;

import starcraft.maps.Map;

public class Starcraft{
	private Player otherPlayer;
	private Player player;
	private Map map;
	private boolean isStart;
	
	public Starcraft(Player player, Player otherPlayer, Map map) {
		this.player = player;
		this.otherPlayer = otherPlayer;
		this.map = map;
		this.isStart=false;
	}

	
	public void	readyGame() throws InterruptedException {
		int count = 6;
		while(count != 1) {
			count --;
			System.out.println(count);
			Thread.sleep(1000);
		}
		System.out.println("게임이 시작되었습니다!!");
		setStart(true);
		startGame();
	}

	public void startGame() {
		if(isStart()) {
			
		}
	}
	
	
	public Player getOtherPlayer() {
		return otherPlayer;
	}


	public void setOtherPlayer(Player otherPlayer) {
		this.otherPlayer = otherPlayer;
	}


	public Player getPlayer() {
		return player;
	}


	public void setPlayer(Player player) {
		this.player = player;
	}


	public Map getMap() {
		return map;
	}


	public void setMap(Map map) {
		this.map = map;
	}


	public boolean isStart() {
		return isStart;
	}


	public void setStart(boolean isStart) {
		this.isStart = isStart;
	}
	
	

}
