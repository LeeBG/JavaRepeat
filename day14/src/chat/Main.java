package chat;

public class Main {
	public static void main(String[] args) {
		Phone p1 = new Phone("김도기");
		Phone p2 = new Phone("천지훈");
		
		p2.sendMessage(p1, "저기요 동전 좀 빌릴수 있을까요?? ");
		p1.sendMessage(p2, "누구쇼");
		
	}
}
