package book;


// 도서 관리 프로그램에서 다룰 도서를 나타내는 클래스
// 도서 제목
// 저자
// 출판일자
// 평점
// 가격

public class Book {
	private String title;						// 제목
	private String author;					// 작가
	private String publish_date;	// 출판일
	private double rating;					// 평점 (소숫점 첫 째 자리까지)
	private int price;								// 가격 (정수 , 출력시 천 단위 구분 기호를 포함)
	
	
	
	// Getter와 Setter들입니다. 설명할 게 없습니다.
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublish_date() {
		return publish_date;
	}
	public void setPublish_date(String publish_date) {
		this.publish_date = publish_date;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
