package chat;

public class Phone {
	private String name;

	public Phone(String name) {
		this.name = name;
	}
	
	// 문자열 메시지를 다른 Phone에게 보내기
	public void sendMessage(Phone target, String message) {
		target.recieveMessage(this, message);
	}
	
	public void recieveMessage(Phone sender, String message) {
		System.out.println("메시지 도착");
		System.out.println("보낸 사람 : " + sender.name);
		System.out.println("내용 : " + message);
	}

	
	
	
	// 문자열 메시지를 다른 Phone에게 보내기
	
	// 전달받은 메시지를 화면에 출력하기
}
