package input;
import java.io.*;
public class Ex08 {
	// 입력
	public static void main(String[] args) throws IOException {
			// 사용자의 입력 및 출력에서 다양한 예외 상황이 발생할 수 있어서 처리해주어야 한다.

		int num;
		System.err.println("에러 출력 스트림");
		System.out.println("표준 출력 스트림");
		System.out.print("글자 하나 입력 (1바이트) : ");
		num = System.in.read();
	
		// 자바에서 System은 실행중인 컴퓨터 자기 자신을 의미한다.
		
		System.out.printf("num : %c, %d\n",num,num);
		
		
		int num2;
		System.out.print("글자 하나 입력 (1바이트) : ");
		// 1바이트 입력 객체
		num2 = System.in.read();
		System.in.read();
		System.in.read();
		System.out.printf("num2 : %c, %d\n", num2, num2);
		
		// 1바이트 입력 객체를 기반으로 2바이트 단위 입력 객체를 생성
		InputStreamReader isr = new InputStreamReader(System.in);
		System.out.print("한 글자 입력 (2 바이트) : ");
		int num3 = isr.read();
		System.out.printf("num2 : %c, %d\n",num3,num3);
		
		// 2바이트 입력객체를 기반으로 줄 단위(버퍼단위)입력 객체를 생성
		BufferedReader br = new BufferedReader(isr);
		br.readLine(); 	// 이전까지 입력한 내용 버리기
		
		System.out.print("문장 입력 : ");
		String str = br.readLine();
		System.out.println("str : " + str);
		
		
		// 위 과정을 간편화 하고, 어느 정도의 예외 까지 내장 처리하게 만든 클래스가 Scanner
		// Scanner를 이용하면 편리하게 입력받을 수 있다.
		isr.read();
	}
}
