package oop;

class Kid {
	//필드 : 서로 다른 자료형의 변수
	private String name;
	private double height;
	
	// 메서드
	void show() {
		System.out.printf("%s의 키는 %.1fcm입니다. \n", name, height);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;	// 객체가 자기자신을 가리키는 멤버변수에 내가 전달한 값을 Set한다.
	}

	void setData(String name, double height) {
		this.name = name;		// 객체가 자기자신을 가리키는 멤버변수에 내가 전달한 값을 Set한다.
		this.height= height;
	}
}
public class Ex02 {
	public static void main(String[] args) {
		
		// Kid 객체를 띄운다. 
		Kid o1 = new Kid();
		Kid o2 = new Kid();
		Kid o3 = new Kid();
		Kid o4 = new Kid();
		Kid o5 = new Kid();
		
		o1.setData("짱구", 105.9);
		o2.setData("유리", 104.2);
		o3.setData("훈이", 106.2);
		o4.setData("맹구", 113.9);
		o5.setData("철수", 108.7);
		
		// 같은 자료형의 데이터가 여러개 있으므로 여러개 묶을 수 있다.
		Kid[] arr = {o1,o2,o3,o4,o5};
		
		for(int i=0;i<arr.length;i++) {
			arr[i].show();
		}
		System.out.println();
		
		for(int i =0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].getName().compareTo(arr[j].getName()) > 0) {
					Kid tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			arr[i].show();
		}
		System.out.println();
	}
}
