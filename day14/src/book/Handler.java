package book;

import java.util.Scanner;

public class Handler {
	// book은 최대 20개까지 담는다고 가정합니다.
	private Book[] books = new Book[20];
	// 빈 생성자이고 main에서 new() 시 내부의 start()함수가 실행된다.
	Handler() {
		start();		// start()가 로직을 시작합니다.
	}
	// 생성자에 담을 메뉴로직이 담긴 함수이다.
	public void start() {
		// 지역변수들입니다. 함수가 끝나면 사라집니다.
		Book tmp;									// 임시로 Book의 정보를 담는 지역 변수
		double rating = 10.1;				// 평점
		int price = -1;								// 가격
		String keyword = "";				// 검색 키워드
		Scanner sc = new Scanner(System.in);		// Scanner
		
		while (true) {	
			System.out.println("1)추가\t 2)수정\t 3)확인\t 4)삭제\t 5)검색\t 0)종료\t");
			System.out.print("메뉴를 입력하세요 >> ");
			switch (Integer.parseInt(sc.nextLine())) {
			case 1:																							// 추가
				tmp = new Book();
				System.out.print("추가할 책의 제목을 입력하세요 >>");
				tmp.setTitle(sc.nextLine());
				System.out.print("추가할 책의 작가를 입력하세요 >> ");
				tmp.setAuthor(sc.nextLine());
				System.out.print("추가할 책의 출판일을 입력하세요 >> ");
				tmp.setPublish_date(sc.nextLine());
				
				while (rating < 0 || rating > 10.0) {								// 잘못된 입력을 막는다.
					System.out.print("추가할 책의 평점(0 ~ 10.0)을 입력하세요 >> ");
					rating = Double.parseDouble(sc.nextLine());
					tmp.setRating(rating);
				}
				
				while (price < 0) {																// 잘못된 입력을 막는다.
					System.out.print("추가할 책의 가격(양수)을 입력하세요 >>");
					price = Integer.parseInt(sc.nextLine());
					tmp.setPrice(price);
				}
				rating = 10.1;						// 다시 while문의 조건이 되기 위해 값 변경
				price = -1;							// 다시 while문의 조건이 되기 위해 값 변경
				add(tmp);							// books에 tmp를 담는다.
				System.out.println("");
				break;
			case 2:																							// 수정
				tmp = new Book();
				System.out.print("수정할 책의 제목을 입력하세요 >> ");
				tmp.setTitle(sc.nextLine());
				System.out.print("수정할 책의 작가를 입력하세요 >> ");
				tmp.setAuthor(sc.nextLine());
				System.out.print("수정할 책의 출판일을 입력하세요 >> ");
				tmp.setPublish_date(sc.nextLine());

				while (rating < 0 || rating > 10.0) {
					System.out.print("수정할 책의 평점(0 ~ 10.0)을 입력하세요 >> ");
					rating = Double.parseDouble(sc.nextLine());
					tmp.setRating(rating);									// tmp에 담긴 책의 평점을 set합니다.
				}

				while (price < 0) {
					System.out.print("수정할 책의 가격(양수)을 입력하세요 >> ");
					price = Integer.parseInt(sc.nextLine());
					tmp.setPrice(price);											// tmp에 담긴 책의 가격을 set합니다.
				}
				rating = 10.1;
				price = -1;
				if(updateBook(tmp) != 0) {
					System.out.println("수정 성공");
				}else {
					System.out.println("없는 책이거나 값의 입력이 잘못됐습니다.");
				}
				System.out.println("");
				break;
			case 3:																						// 확인
				showBooks();
				break;
			case 4:																						// 삭제
				System.out.print("삭제할 책의 제목을 입력하세요 >> ");
				String d_title = sc.nextLine();									// 삭제할 책의 제목을 정확히 입력받아야 삭제가 된다
				System.out.print("삭제할 책의 작가를 입력하세요 >> ");
				String d_author = sc.nextLine();							// 삭제할 책의 작가또한 정확히 입력받아야 삭제가 된다.
				if(deleteBook(d_title, d_author)!=0) {				// 0을 반환한다면 실패이고 0이 아닌 1이라면 삭제 성공이다.
					System.out.println("삭제 완료!!");
				}else {
					System.out.println("삭제 실패!!");
				}
				break;
			case 5:																						// 책의 제목이나 작가를 입력하는데 이 키워드가 일부분이라도 검색이 된다.
				System.out.print("검색할 내용을 입력하세요 >>  ");
				keyword = sc.nextLine();
				showBooks(searchBook(keyword));
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				return;
			}
		}
	}

	// 책 추가하기;(결과는 int형 리턴값의 값 대조로 실행성공 여부를 판단한다)
	public int add(Book book) {
		int row = 0;															// 실패시 0을 반환
		for (int i = 0; i < books.length; i++) {		// books의 길이만큼
			if (books[i] == null) {									// books내부의 book이 널이면
				books[i] = book;										// 매개변수에 담긴 book을 담는다.
				row = 1;														// 실행 성공시 1을 반환한다.
				break;												
			}
		}
		return row;
	}

	// 책 수정(결과는 int형 리턴값의 값 대조로 실행성공 여부를 판단한다)
	public int updateBook(Book book) {
		int row = 0;
		for (int i = 0; i < books.length; i++) {//books의 책들 중에서
			if (books[i] != null && books[i].getTitle().equals(book.getTitle())// 책 제목과 작가가 같다면
					&& books[i].getAuthor().equals(book.getAuthor())) {
				books[i] = book;					// book을 업데이트 한다.
				row = 1;									// 성공시 1을 반환한다.
				break;										// 반복문 탈출
			}
		}
		return row;									// 실패시 초기값0을 반환하고 성공시 1을 반환한다.
	}

	// 존재하는 모든 도서들의 정보를 보여준다.
	public void showBooks() {
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) {			// null은 출력 못함
				System.out.println("\n================================");
				System.out.println("책 제목 : " + books[i].getTitle());
				System.out.println("책 작가 : " + books[i].getAuthor());
				System.out.println("책 출판일 : " + books[i].getPublish_date());
				System.out.println("책 평점 : " + books[i].getRating()+"점");
				System.out.printf("책 가격 : %,1d원\n", books[i].getPrice());
				System.out.println("================================\n");
			}
		}
	}
	
	// 검색된 도서들의 정보를 배열 인자값으로 받아서 보여준다.
	public void showBooks(Book[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) {
				System.out.println("\n================================");
				System.out.println("책 제목 : " + array[i].getTitle());
				System.out.println("책 작가 : " + array[i].getAuthor());
				System.out.println("책 출판일 : " + array[i].getPublish_date());
				System.out.println("책 평점 : " + array[i].getRating()+"점");
				System.out.printf("책 가격 : %,1d원\n", array[i].getPrice());
				System.out.println("================================\n");
			}
		}
	}
	
	// 책의 제목과 작가를 입력받아 삭제한다.(결과는 int형 리턴값의 값 대조로 실행성공 여부를 판단한다)
	public int deleteBook(String title, String author) {
		int row = 0;																																// 실패시 0을 리턴
		for (int i = 0; i < books.length; i++) { 																			
			if (books[i] != null && books[i].getTitle().equals(title) && books[i].getAuthor().equals(author)) {
				books[i] = null;																			// 책이 비어 있지 않고,책 제목과 작가가 같다면 null값을 주고 삭제한다.
				row = 1;																						// 삭제 성공시 1반환
				break;
			}
		}
		return row;
	}

	// 키워드가 책의 제목 또는 작가의 이름에 속해 있다면 책 객체의 배열로 반환한다.
	public Book[] searchBook(String keyword) {
		int count = 0;									// 책의 배열 인덱스를 결정하는 count로 키워드가 있는 책의 갯수를 카운트한다.
		Book[] result;									// 함수의 결과 리턴
		for (int i = 0; i < books.length; i++) {	// 모든 책들을 검사해서 키워드가 포함된 제목의 책을 카운트한다.
			if (books[i] != null && (books[i].getTitle().contains(keyword) || books[i].getAuthor().contains(keyword))) {
				count++;
			}
		}
		
		result = new Book[count];					// 카운트한 크기의 Book 배열을 만들어서 result배열에 담는다.
		int index = 0;												// 배열의 index는 0부터 시작
		for (int i = 0; i < books.length; i++) {
			if(books[i] != null && (books[i].getTitle().contains(keyword) || books[i].getAuthor().contains(keyword))) {
				result[index++] = books[i];		// result[0]부터 book[i]를 담고 ; 이후 index+=1;
			}
		}
		return result;											// 결과 배열을 반환한다.
	}

}
