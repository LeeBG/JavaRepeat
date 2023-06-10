package abstractClass;

//직접 객체를 생성하지 않고 상속을 위한 클래스이다.
abstract class MyButton2 {	
	// 일반 메서드 click() : 내장된 onClick()을 실행한다.
	public void click() throws Exception{	//일반 메서드 click() : 내장된 onclick()을 실행한다.
		this.onClick();
	}
	
	// 추상 메서드 onClick() : 내용은 정해지지 않았다.
	protected abstract void onClick() throws Exception;
}

//MyButton을 상속받는 클래스 TestButton 
class TestButton2 {

	protected void onClick() throws Exception {
		System.out.println("Test");
	}	
}

class SquareButton2{
	private int size;
	
	public SquareButton2(int size) {
		this.size = size;
	}

	protected void onClick() throws Exception {
		for(int i=0;i<size;i++) {
			for(int j=0;j<size; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}
}


public class Ex03 {
	public static void main(String[] args) throws Exception {
		// 상속이 없을 때의 경우
		
		TestButton btn1 = new TestButton();
		btn1.click();
		
		SquareButton btn2 = new SquareButton(5);
		btn2.click();
		
		Object[] arr = {btn1, btn2};
		
		// 최상위 클래스 Object는 모든 클래스의 최상위 부모클래스이다.
//		for(Object ob:arr) {
//			ob.onClick();
//			ob.click();
//		}
		// Object클래스에는 click() 혹은 Onclick()이라는 함수가 없어서 호출 불가능
		// 개별 실행은 가능하지만, 일괄 처리는 불가능하다.
		
	}
}
