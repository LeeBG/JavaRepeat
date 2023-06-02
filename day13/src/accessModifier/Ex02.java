package accessModifier;

class Test2{
	String name;
	int age;
}

class Test3 {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
}


public class Ex02 {
	public static void main(String[] args) {
		Test2 ob = new Test2();
		ob.name = "이지은";
		ob.age = 31;
		System.out.printf("%s의 나이는 %d살입니다 \n",ob.name,ob.age);
		
		Test3 ob2 = new Test3();
		ob2.setName("홍진호");
		ob2.setAge(42);
		System.out.printf("%s의 나이는 %d살입니다.\n", ob2.getName(),ob2.getAge());
	}
}
