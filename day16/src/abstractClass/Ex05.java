package abstractClass;


// 운영체제/장치종류에 상관없이 PC주변기기를 컴퓨터에 연결할 수 있는 표준 프로토콜
interface USB{
	void onConnect();
}


// 옛날에 쓰던 저장장치
class FloopyDisk {
	
}

// PC에 연결하는 저장장치
class MemoryStick extends FloopyDisk implements USB{

	@Override
	public void onConnect() {
		System.out.println("USB 메모리 연결됨. 탐색기 실행");
	}
	
}

// PC에 연결하는 입력장치
class Keyboard implements USB{
	@Override
	public void onConnect() {
		System.out.println("키보드 연결됨. 국가 코드 및 언어 탐색 후 적용");
	}
}

// PC에 연결하는 출력장치
class Speaker implements USB{
	@Override
	public void onConnect() {
		System.out.println("스피커 연결됨. 음성 채널 설정 및 볼륨 테스트");
	}
}

// 진짜 PC
class PC {
//	void connect(Speaker device) {}		// AUX
//	void connect(Keyboard device) {}		// PS2
//	void connect(MemoryStick device) {}		// Floopy Disk
	
	void connect(USB device) {
		device.onConnect();
	}
}

public class Ex05 {
	public static void main(String[] args) {
		Speaker ob1 = new Speaker();
		MemoryStick ob2= new MemoryStick();
		Keyboard ob3 = new Keyboard();
		
		PC pc = new PC();
		
		// 서로 다른 객체의 자료형을 묶어준다.(업캐스팅의 역할을 할 수 있다.)
		// 자료형을 묶어 줬지만 USB를 꽂았을 때 장치마다의 반응은 달라야하기 때문에
		pc.connect(ob1);
		pc.connect(ob2);
		pc.connect(ob3);
		
		// 온 커넥트
		USB mouse = () -> System.out.println("마우스 연결됨...");
		pc.connect(mouse);
		
		// 인터페이스의 추상 메서드가 오직 하나만 있으면 "함수형 인터페이스"라고 한다.
		// 함수형 인터페이스는 자바 8에서 추가된 람다식으로 이용하여 객체를 생성할 수 있다.
		// 익명 클래스와 유사하지만, 훨씬 더 간결한 문법으로 처리할 수 있다.
	}
}
