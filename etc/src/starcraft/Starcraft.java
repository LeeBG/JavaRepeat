package starcraft;

import starcraft.maps.Map;
import starcraft.units.protoss.Zealot;
import starcraft.units.terran.Vulture;
import starcraft.units.zerg.Hydrarisk;

public class Starcraft{
	private Player otherPlayer;
	private Player player;
	private Map map;
	private boolean isStart;
	
	public Starcraft(Player player, Player otherPlayer, Map map) throws InterruptedException {
		this.player = player;
		this.otherPlayer = otherPlayer;
		this.map = map;
		this.isStart=false;
		System.out.printf("%s(%s)와 %s(%s)의 경기가 곧 시작됩니다. \n",player.getName(),player.getRace(),otherPlayer.getName(),otherPlayer.getRace());
		this.readyGame(player, otherPlayer);
	}

	
	public void	readyGame(Player player1, Player player2) throws InterruptedException {
		int count = 6;
		while(count != 1) {
			count --;
			System.out.println(count);
			Thread.sleep(1000);
		}
		System.out.println("게임이 시작되었습니다!!");
		setStart(true);
		startGame(player1,player2);
	}

	public void startGame(Player player1, Player player2) {
		if(isStart()) {
			
			if(player1.getRace().equals("저그")) {
				player1.getUnits().add(new Hydrarisk(1));
			}else if(player1.getRace().equals("테란")) {
				player1.getUnits().add(new Vulture(true));
			}else if(player1.getRace().equals("프로토스")){
				player1.getUnits().add(new Zealot(1));
			}
			
			if(player2.getRace().equals("저그")) {
				player2.getUnits().add(new Hydrarisk(1));
			}else if(player2.getRace().equals("테란")) {
				player2.getUnits().add(new Vulture(true));
			}else if(player2.getRace().equals("프로토스")){
				player2.getUnits().add(new Zealot(1));
			}
						
			
			player1.getUnits().get(0).attack(player2.getUnits().get(0));
			player2.getUnits().get(0).attack(player1.getUnits().get(0));
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
