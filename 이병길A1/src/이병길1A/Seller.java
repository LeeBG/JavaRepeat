package 이병길1A;

public class Seller extends Member {
	private String storeName;
	
	public Seller(String id, String passwd, String name,String storeName) {
		super(id, passwd, name);
		this.storeName = storeName;
	}

	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	
}
