package loop;

import java.io.*;
import java.util.*;

public class Ex04 {
	public static void main(String[] args) throws FileNotFoundException {
		// 어떤 파일을 지정하냐에 따라서 문서 내용의 줄 수(반복횟수)가 달라질 수 있다.
		
		String fileName  = "src/loop/Ex01.java";
		File f = new File(fileName);
		Scanner sc = new Scanner(f);
		int cnt = 0;
		
		while(sc.hasNextLine()) {		 // 다음줄이 확인하여, 다음 줄이 있으면 true
			cnt += 1;
			String line = sc.nextLine();
			System.out.printf("%d : %s \n ", cnt, line);
		}
		
		sc.close();
	}
}
