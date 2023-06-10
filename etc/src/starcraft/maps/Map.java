package starcraft.maps;

public class Map {
	private String name;
	private int x;
	private int y;
	private int mans; 		// 2인용 3인용 4인용 8인용 맵
	
	
	public Map(String name, int x, int y, int mans) {
		this.name = name;
		this.mans = mans;
		this.x = x;
		this.y = y;
	}
	
	
}
