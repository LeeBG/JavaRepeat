package tv;

import java.util.Date;
import java.text.SimpleDateFormat;

// 필드와 메서드
// 필요하다면 생성자를 활용하여
// TV객체의 구성을 클래스로 나타냅니다.
// 속성은 필드
// 기능(동사형)은 메서드로 나타냅니다.
public class TV {
	// 제조사
	private String company;
	// TV 상품명
	private String tvName;
	// 필드
	private boolean isPower;
	// 채널의 종류
	private String sort;
	// 제조일자
	private String make_date;
	// 소리
	private int volume;
	private final int MaxVolume = 50;
	private final int MinVolume = 0;
	private int priviousVolume;

	// 채널
	private int channel;
	private final int MaxChannel = 999;
	private final int MinChannel = 0;
	// 음소거
	private boolean isMute;
	
	// Tv의 상세정보
	public void showTv() {
		System.out.println();
		
		if(getIsPower()) System.out.println("_________________\\__On__/_________________");
		else System.out.println("_________________\\__Off__/________________");
		System.out.println("|제품명  : " + getTvName()+"\t\t\t |");
		System.out.println("|제조사 : " + getCompany()+"\t\t\t\t |");
		System.out.println("|제조일자 : " + getMake_date()+"\t\t |");
		System.out.println("|전원 켜져있나요? :" + (getIsPower() ? "켜짐" : "꺼짐")+"\t\t\t |");
		System.out.println("|음소거 상태인가요? : " + (getIsMute() ? "음소거\t" : "음소거 아님")+"\t\t |");
		System.out.println("|현재 채널 : " + getChannel() + " ["+Category()+"]"+"\t\t\t |");
		System.out.println("|현재 볼륨 : " + getVolume()+"\t\t\t\t |");
		System.out.println("|________________________________________|");
	}
	
	// 기본 생성자입니다.
	public TV() {
	}


	// 생성자입니다.
	public TV(String company, String tvName) {
		Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.make_date = format.format(date);				// 제조일자
        this.isPower = false;															// 전원 꺼짐 여부
		this.company = company;												// 제조사
		this.tvName = tvName;													// 제품명
		this.volume = 0;																	// 볼륨
		this.priviousVolume = 0;												// 음소거할때 담을 이전 볼륨
		this.channel = 0;																	// 채널
		this.isMute = false;																// 음소거인지 아닌지 여부
		this.sort="예능 채널";															// 현재 채널이 속한 카테고리
	}

	// Tv On/Off
	public void turn() {
		setIsPower(!getIsPower());
	}
	
	
	// 음소거
	public void pushMute() {
		if (getIsPower()) {
			if (!getIsMute()) {
				setPriviousVolume(volume);
				setVolume(0);
			} else {
				setVolume(getPriviousVolume());
				setPriviousVolume(0);
			}
			setIsMute(!getIsMute());
		}
	}

	// 볼륨 낮추기
	public int downVolumn() {
		if (getIsPower()) {		// 켜져있을 때만 동작합니다.
			if(getIsMute()) {		// 음소거 상태에서 누르면 음소거 풀립니다.
				pushMute();
			}
			if (getVolume() > getMinVolume())// 최소 음량제한이 있습니다.
				setVolume(volume - 1);
		}
		return volume;
	}

	// 볼륨 올리기
	public int upVolumn() {
		if (getIsPower()) {			// 켜져있을 때만 동작합니다.
			if(getIsMute()) {			// 음소거 상태에서 누르면 음소거 풀립니다.
				pushMute();
			}
			if (getVolume() < getMaxVolume())	// 최대 음량제한이 있습니다.
				setVolume(volume + 1);
		}
		return volume;					// void로 바꿔도 상관없습니다.
	}

	// 채널 낮추기
	public int downChannel() {
		if (getIsPower()) {			// 켜져있을 때만 동작합니다.
			if (getChannel() > getMinChannel())	// 최소 음량제한이 있습니다.
				setChannel(channel - 1);
			else {
				setChannel(MaxChannel);
			}
		}
		return channel;
	}

	public int upChannel() {
		if (getIsPower()) {					// 켜져있을 때만 동작합니다.
			if (getChannel() < getMaxChannel())	// 최대 음량제한이 있습니다.
				setChannel(channel + 1);
			else
				setChannel(0);
		}
		return channel;
	}

	public String Category() {						// 간단한 카테고리 편성표입니다. 채널 100개를 기준으로 컨셉이 나뉩니다.
		switch (getChannel() / 100) {
		case 1:
			setSort("뉴스 채널");
			break;
		case 2:
			setSort("키즈 채널");
			break;
		case 3:
			setSort("요리 채널");
			break;
		case 4:
			setSort("스포츠 채널");
			break;
		case 5:
			setSort("해외 채널");
			break;
		case 6:
			setSort("바둑 채널");
			break;
		case 7:
			setSort("종교 채널");
			break;
		case 8:
			setSort("라디오 채널");
			break;
		case 9:
			setSort("음악 채널");
			break;
		default:
			setSort("예능 채널");
		}
		return getSort();
	}

	// 카테고리 (Sort)
		public void showCategory() {
			System.out.println(getChannel()+"번은 "+Category()+"입니다.");
		}
	
	// Lombok 마렵다.
	
	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getTvName() {
		return tvName;
	}

	public void setTvName(String tvName) {
		this.tvName = tvName;
	}

	public boolean getIsPower() {
		return isPower;
	}

	public void setIsPower(boolean isPower) {
		this.isPower = isPower;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getPriviousVolume() {
		return priviousVolume;
	}

	public void setPriviousVolume(int priviousVolume) {
		this.priviousVolume = priviousVolume;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public boolean getIsMute() {
		return isMute;
	}

	public void setIsMute(boolean isMute) {
		this.isMute = isMute;
	}

	public int getMaxVolume() {
		return MaxVolume;
	}

	public int getMinVolume() {
		return MinVolume;
	}

	public int getMaxChannel() {
		return MaxChannel;
	}

	public int getMinChannel() {
		return MinChannel;
	}

	public String getMake_date() {
		return make_date;
	}

	public void setMake_date(String make_date) {
		this.make_date = make_date;
	}
	
}
