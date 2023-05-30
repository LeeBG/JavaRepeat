package oop;

class Human {
	// 멤버 필드 	:	객체가 가지는 내부 변수
	// 사람의 이름(문자열)과 나이(정수), 키와 체중(실수) 변수로 선언하세요
	
	// 멤버 메서드 : 객체가 호출할 수 있는 내부 함수
	// 1) (문자열, 정수, 실수, 실수)를 전달 받아서 멤버 필드에 저장하는 함수
	// 2) 저장된 값을 한 줄씩 출력하고 마지막에 한 줄 띄우는 함수
	private String name;
	private int age;
	private double height;
	private double weight;

	
	// 매개변수 생성자를 만든 순간부터 이런식으로 set할 필요없다.
	// 멤버 메서드 : 객체가 호출할 수 있는 내부 함수
	// 1) (문자열, 정수, 실수, 실수) 를 전달 받아서 멤버 필드에 저장하는 함수
	void setHuman(String name,int age,double height, double weight) {
		this.name=name;
		this.age=age;
		this.height=height;
		this.weight=weight;
	}
	// 2) (멤버 필드에) 저장된 값을 한 줄씩 출력하고 마지막에 한 줄 띄우는 함수
	void show() {
		System.out.printf("%s님의 나이는 %d살이고 키는 %.1fcm 체중은 %.1fkg 입니다.\n",this.getName(),this.getAge(),this.getHeight(),this.getWeight());
	}

	// 3) 객체를 생성하면서 값을 할당하는 생성자를 작성한다.
	// 생성자는 클래스의 이름과 같으며 반환형을 지정하지 않는 특수한 함수이다.
	// 생성자를 작성하지 않으면, 컴파일시에 기본 생성자를 자동으로 만들어준다.
	//	생성자를 작성했다면, 자동으로 기본 생성자를 만들어주지 않는다.
	Human(String name, int age, double height, double weight) {	// 생성자의 매개변수로 멤버변수를 인자로 받아 초기화해준다.
		// this는 class에 정의된 객체 자기 자신을 의미한다.
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	// 4) 직접 생성자를 작성했다면 기본 생성자가 자동작성되지 않기 때문에
	// 별도로 작성해주어야한다.
	// 생성자 오버로딩으로 기본 생성자를 만들어준다.
	Human() {		// 기본 생성자는 매개변수가 있는 생성자가 있다면 자동생성되지 않는다.
		super();
	}
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getAge() {
		return age;
	}
	void setAge(int age) {
		this.age = age;
	}
	double getHeight() {
		return height;
	}
	void setHeight(double height) {
		this.height = height;
	}
	double getWeight() {
		return weight;
	}
	void setWeight(double weight) {
		this.weight = weight;
	}
}

public class Ex05 {
	public static void main(String[] args) {
		// 서로 다른 Human객체 3개를 생성하고, 각각 다른 값을 넣어주세요
		// 배열로 묶어서 구성하세요
		// 반복문을 이용하여 여러명의 데이터를 출력하세요.
		
		//클래스 존재의 의미는 객체를 생성하기 위함이다.
		Human human1 = new Human();
		Human human2 = new Human();
		Human human3 = new Human();
		
		human1.setHuman("홍길동", 23, 176.2, 65.3);
		human2.setHuman("임꺽정", 42, 182.2, 85.3);
		human3.setHuman("김민재", 51, 166.2, 55.3);
		
		Human human4 = new Human("나단비",5,105.2,35);
		Human[] array = {human1, human2, human3, human4};
		for(int i=0;i<array.length;i++) {
			array[i].show();
		}
		System.out.println();
		
	}
}
