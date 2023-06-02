package static_final;
class Guest {
	String name;				// non-static 필드
	static int count;		// static 필드
	Guest(String name) {		// 생성자
		this.name = name;
		count +=1;						// 객체를 생성할 때마다, count의 값을 1증가 시킨다.
	}
	
	void show() {
		System.out.println(name + " 입장 !!!");
		System.out.println("현재 까지 입장한 손님의 인원 수 : "+count);
	}
	
}
public class Ex02 {
	public static void main(String[] args) {
		Guest ob1 = new Guest("홍길동");
		ob1.show();
		Guest ob2 = new Guest("홍진호");
		ob2.show();
		Guest ob3 = new Guest("임꺽정");
		ob3.show();
		Guest ob4 = new Guest("이순신");
		ob4.show();
		
		System.out.println("현재까지의 손님 수 : "+ Guest.count);
		
		// 이텔릭 채로 기울어져 있다면 static메서드입니다.
		System.out.println(Integer.parseInt("1234")+1);
	}
}
