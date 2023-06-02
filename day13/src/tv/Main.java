package tv;

public class Main {
		
	public static void main(String[] args) {
		TV tv = new TV("LG", "울트라 HD TV");
		RemoteController remocon = new RemoteController();
		remocon.setTv(tv);			// 이 리모컨은 위의 TV를 조작합니다.
		
		// 리모컨의 메서드를 호출하면, TV의 기능이 작동하도록 코드를 작성하여
		// 아래에서 테스트하세요.
		
		remocon.showStatus(); // 티비 꺼진 상태에서 한번 보기
		remocon.pushTurn();		// 티비 먼저 켜기
		
		remocon.pushNumber(400);			// 400번으로 채널 변경
		remocon.upChannel();	// 채널올리기
		for(int i=0;i<200;i++) {
			remocon.upChannel();
			if(i%100 == 0) {
				remocon.showStatus();	
			}
		}
		remocon.showStatus();		// 티비 상태확인
		
		remocon.upVolume();
		remocon.upVolume();
		remocon.upVolume();
		remocon.upVolume();
		remocon.upVolume();
		
		remocon.showStatus();		// 티비 상태확인
		
		remocon.pushTurn();			// 티비 끄기
																// 티비 꺼져서 아래버튼 작동안함
		remocon.upChannel();
		remocon.upChannel();
		remocon.upChannel();
		remocon.upChannel();
		remocon.upChannel();
		remocon.upVolume();
		remocon.upVolume();
		remocon.upVolume();
		remocon.upVolume();
		
		remocon.showStatus();		// 티비 상태확인
		remocon.pushTurn();			// 티비 다시 켜기
		
		remocon.pushMute();			// 음소거
		remocon.showStatus();		// 티비 상태확인
		remocon.downVolume();	// 음소거 상태에서 볼륨을 낮추면 음소거 풀리고 볼륨 내려감
		remocon.showStatus();		// 티비 상태확인
		
		remocon.getTv().inject_removeHdmi1();
		
		
		remocon.externalInput();
		
	}
}
