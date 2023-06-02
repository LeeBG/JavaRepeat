package student;


// 학생 관리 프로그램에서 1명의 학생 정보를 저장할 객체의 클래스를 구성합니다.
// 이름, 국어, 영어,수학,합계,평균 정보를 저장합니다.
// 생성자에는 이름과 국영수 점수만 전달받습니다.
// 국영수 점수를 이용하여 합계와 평균을 계산하여 저장합니다.
// show() 함수를 작성하여 이름과 합계 및 평균을 화면에 출력합니다.
// 필드는 private, 생성자와 메서드는 public으로 설정합니다.

public class Student {
	private int mat,eng,kor;
	private String name;
	private double avg;
	private int sum;
	
	public Student(String name,int kor, int eng, int mat) {
		this.mat = mat;
		this.eng = eng;
		this.kor = kor;
		this.name = name;
		calculator();
	}
	// 국영수 점수 바뀌면 calculator() 다시 계산
	public void calculator() {
		setSum(mat+eng+kor);
		setAvg(getSum()/3.0); 
	}
	
	
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
		calculator();
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
		calculator();
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
		calculator();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}

	public void show() {
		System.out.println("이름 : "+getName());
		System.out.println("국어 :  "+getKor());
		System.out.println("영어 :  "+getEng());
		System.out.println("수학 :  "+getMat());
		System.out.println("합계 :  "+getSum());
		System.out.printf("평균 %.2f\n",getAvg());
		System.out.println();
	}
	
	
}
