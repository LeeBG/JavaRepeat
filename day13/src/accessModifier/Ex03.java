package accessModifier;

//getter /setter
// getter : 필드의 값을 반환하여 외부에서 참조할 수 없도록 처리하는 메서드
// setter : 외부에 매개변수 값을 전달받아서 내부 멤버 필드의 값에 대입하는 메서드

class Test4{
	String str;
	int num;
	boolean over;
	
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public boolean isOver() {
		return over;
	}
	public void setOver(boolean over) {
		this.over = over;
	}

}


public class Ex03 {
	public static void main(String[] args) {
		Test4 ob= new Test4();
		
		ob.setStr("Hello");
		ob.setNum(1234);
		ob.setOver(false);
		
		System.out.println("ob.str : "+ob.getStr());
		System.out.println("ob.num : "+ob.getNum());
		System.out.println("ob.over : "+ob.isOver());
	}
}
