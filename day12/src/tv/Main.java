package tv;

public class Main {
	public static void main(String[] args) {
		// TV
		TV tv = new TV("LG","울트라 HD TV");	 				// 객체 생성 시점으로 TV가 생산이 되었고 작동 테스트 시작
		
		// 생성된 TV객체의 기능 테스트;
		tv.turn();																				// TV ON
		System.out.println("채널 구간별 카테고리입니다!");
		for(int i=0;i<tv.getMaxChannel();i++) {				// 채널 끝까지 올리면서
			tv.upChannel();
			if(i%100 == 0) {																// 채널별 카테고리 출력 100단위로 컨셉이 바뀜
				tv.showCategory();
			}
		}
		for(int i=0;i<tv.getMaxVolume();i++) {		// 볼륨 끝까지 올리기
			tv.upVolumn();			
		}
		tv.showTv();																// 최대 채널과 최대 볼륨을 가진 TV의 현재 상태(음소거 아님)
		tv.upChannel();														// 최대 채널에서 올리기 999 -> 0
		tv.upVolumn();															// 최대 볼륨에서 올리기 50->50
		tv.pushMute();															// 음소거 50 -> 0 
		tv.showTv();			
		tv.downVolumn();													// 음소거 상태에서 볼륨 조절하면 음소거 풀립니다. 그리고 볼륨내리기
		tv.showTv();																
		tv.downChannel();													// 최소 채널에서 내리기 0 -> 999
		tv.showTv();
		tv.turn();																		// 티비 껐다.
		tv.downChannel();													// 티비 꺼져서 동작안함
		tv.downChannel();													// 티비 꺼져서 동작안함
		tv.downVolumn();													// 티비 꺼져서 동작안함
		tv.downVolumn();													// 티비 꺼져서 동작안함
		tv.pushMute(); 														// 티비 꺼져서 동작안함
		tv.showTv();																// 출력
		
	}
}
