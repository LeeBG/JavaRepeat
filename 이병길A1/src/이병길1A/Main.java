package 이병길1A;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Handler handler = new Handler();				// 핸들러 객체 생성
		String id = null;															// id 값을 받을 변수
		String keyword = null;											// 검색 키워드를 받을 변수
		Member[] searchedmember = null;			// 검색 후 결과 Member 배열 받을 변수 
		Scanner sc = new Scanner(System.in);	// 입력을 받기 위한 Scanner
		int menu = 0;																// 메뉴 변수
		int res= 0;																		// 회원가입이나 탈퇴의 결과상태를 알려주는 int 변수
		
		while(true) {
			menu = selectMenu(sc);								// 주메뉴 선택 함수로 리턴받은 값이 메뉴
			switch (menu) {
			case 1:
				menu = selectMemberType(sc);
				res = handler.join(menu,sc);
				if(res != 0) {
					System.out.println("회원가입이 정상적으로 처리되었습니다.");
				}else {
					System.out.println("회원가입에 실패하셨습니다.");
				}
				break;
			case 2:
				handler.selectAll();
				break;
			case 3:
				System.out.println("\t\t 아이디로 검색합니다!!");
				System.out.print("검색할 id를 입력하세요 >> ");
				keyword = sc.nextLine();
				searchedmember = handler.searchMember(keyword);
				handler.selectAll(searchedmember);
				break;
			case 4:
				System.out.print("아이디를 정확히 입력하여 탈퇴합니다");
				id = sc.nextLine();
				res = handler.out(id,sc);
				if(res == 1) {
					System.out.println("\t\t 회원 탈퇴 처리하였습니다.");
				}else if(res == 0){
					System.out.println("\t\t 회원 탈퇴를 취소하였습니다.");
				}else {
					System.out.println("\t\t 회원 탈퇴 실패하였습니다.");
				}
				break;
			case 5:
				handler.sort();
				break;
			case 0:
				System.out.println("프로그램 종료");
				sc.close();															// Scanner 닫기
				return;
			default:
				break;
			}
		}
	}

	
	// 주 메뉴 선택 함수
	private static int selectMenu(Scanner sc) {			
		System.out.println("1. 회원가입");
		System.out.println("2. 전체 목록");
		System.out.println("3. 회원검색");
		System.out.println("4. 회원탈퇴");
		System.out.println("5. 회원 정렬");
		System.out.println("0.  종료");
		System.out.print("메뉴 선택 >> ");
		int num = Integer.parseInt(sc.nextLine());
		return num;
	}
	
	// 회원가입시 멤버 유형 선택  함수
	private static int selectMemberType(Scanner sc) {		
		System.out.print("회원 유형을 선택하세요 (1.구매자 2.판매자) >> ");
		return Integer.parseInt(sc.nextLine());
	}
	
}
