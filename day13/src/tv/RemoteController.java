package tv;

public class RemoteController {
	private TV tv;
	
	
	public TV getTv() {
		return tv;
	}

	public void setTv(TV tv) {
		this.tv = tv;
	}

	public void pushNumber(int channel) {
		this.tv.setChannel(channel);
	}

	// 전원 끄기
	public void pushTurn() {
		this.tv.turn();
	}

	// 현재 TV의 상태를 출력해봅니다.
	public void showStatus() {
		this.tv.showTv();
	}

	// 볼륨 낮추기 버튼
	public void downVolume() {
		this.tv.downVolumn();
	}

	// 볼륨 올리기 버튼
	public void upVolume() {
		this.tv.upVolumn();
	}

	public void pushMute() {
		this.tv.pushMute();
	}

	// 채널
	// 채널 내리기 버튼
	public void downChannel() {
		this.tv.downChannel();
	}

	// 채널 올리기 버튼
	public void upChannel() {
		this.tv.upChannel();
	}
	
	// 외부입력 버튼
	public void externalInput() {
		String str = "========================\n";
		if(this.tv.getIsHdmi1()) {
			str += "셋톱박스 장치가 인식되어있습니다.\n";
		}
		if(this.tv.getIsHdmi2()) {
			str += "노트북 장치가 인식되어있습니다.\n";
		}
		if(this.tv.getIsUsb()) {
			str += "USB가 인식되어있습니다. \n";
		}
		if(str.equals("========================\n"))	str = "외부입력장치가 없습니다.\n";
		
		System.out.println(str);
		System.out.println("========================\n");
	}
	
	
	
}
