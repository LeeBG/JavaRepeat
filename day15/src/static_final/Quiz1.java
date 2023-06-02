package static_final;

class Card {

	private char kind;			// 스페이드, 클로버, 하트 (객체마다 서로 다른 값)
	private int num;			// 카드 숫자 (객체마다 서로 다른 값)
	public static final int WIDTH = 7;	// 카드의 가로 너비 (여러 객체가 같은 값을 공유해야 한다)
	public static final int HEIGHT = 7;	// 카드의 세로 높이 (여러 객체가 같은 값을 공유해야 한다)
	private String p;			// 객체마다 서로 달라야 한다


	public void setCardProperty(char kind, int num) {
		this.kind = kind;
		this.num = num;
		if (kind == 'H')			p = "♥";
		else if (kind == 'S')		p = "♠";
		else if (kind == 'C')		p = "♣"; // 다이아는 형태 깨져서 안만듬
	}

	public void showCard() {
		System.out.println("[" + kind + num + " CARD]");
		for (int i = 0; i < HEIGHT; i++) {
			if (i == 0)					System.out.print("┌");
			else if (i == HEIGHT - 1)	System.out.print("└");
			else						System.out.print("│");// 줄의 가장 왼쪽

			if (i == 0 || i == HEIGHT - 1) // 줄의 가운데 부분 출력
				for (int j = 0; j < WIDTH; j++)
					System.out.print("─");
			else {
				for (int j = 0; j < WIDTH; j++) {
					if(num < 4) {
						if (j == WIDTH / 2 && (i >= HEIGHT / 2 - num / 2 && i <= HEIGHT / 2 + num / 2)) {
							if (num % 2 == 0 && i == HEIGHT / 2)
								System.out.print(" ");
							else	
								System.out.print(p);
						} else
							System.out.print(" ");
					}else if(num > 3 && num < 9) {  
						if (j == WIDTH / 4 && (i >= HEIGHT / 2 - num / 2 && i <= HEIGHT / 2 + num / 2)) {
							if (num % 2 == 0 && i == HEIGHT / 2)
								System.out.print(" ");
							else	
								System.out.print(p);
						} else
							System.out.print(" ");
					}
				}
			}

			if (i == 0)					System.out.print("┐");
			else if (i == HEIGHT - 1)	System.out.print("┘");
			else						System.out.print("│");
			System.out.println();
		}
	}

}

public class Quiz1 {
	public static void main(String[] args) {
		// 객체를 생성하기 전에 미리 카드의 크기를 결정하고
		// 이후 같은 크기로 카드들을 생성합니다
		
		Card card1 = new Card(); // 하나의 클래스로 서로 다른 객체를 생성한 경우
		Card card2 = new Card(); // 객체들이 같은 값을 갖게 만들고 싶다면
		Card card3 = new Card(); // static을 활용하면 된다
		
		card1.setCardProperty('H', 1);
		card1.showCard();
		card2.setCardProperty('C', 3);	
		card2.showCard();
		card3.setCardProperty('S', 2);
		card3.showCard();
		
	}
}
