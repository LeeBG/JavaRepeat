package inheritance;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex06_TimeMessageBox extends Ex06_MessageBox{
	
//	서브클래스는 반드시 슈퍼클래스의 생성자를 호출해야한다.
//	슈퍼클래스의 기본 생성자가 없으므로, 생성자를 직접 연결해야 한다.
	
	public Ex06_TimeMessageBox(Scanner sc) {
		super(sc);				// 자신의 생성자를 호출할 때에는 this, 슈퍼클래스의 생성자는 super()
	}
	
	@Override
	public void input() {					// 부모의 접근제한자 는 package 자식의 접근제한자는 더 범위를 좁힐수는 없다.(자식에서 private불가능)
		System.out.print("메시지 입력 >> ");
		Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일 a HH시 mm분 ss초"); 	// a는 오후/오전표시
        String time=format.format(date);
	setMessage("["+time+"]"+getSc().nextLine());
	}
}
