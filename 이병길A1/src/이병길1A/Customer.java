package 이병길1A;

public class Customer extends Member{
	// 배송 주소
		private String address;
	
	public Customer(String id, String passwd, String name,String address) {
		super(id, passwd, name);
		this.address=address;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
