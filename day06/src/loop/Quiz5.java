package loop;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Quiz5 {
	public static void main(String[] args) {
		/* 
		 * 천단위 구분 기호 (,)직접 구현하기
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int n1;
		String n2="";
		int count = 0;
		Stack<String> tmpStack = new Stack<>();
		
		System.out.print("입력 : ");
		n1 = sc.nextInt();
		
		// ,로 분기시키면서 뒤집기
		while(n1 != 0) {
			tmpStack.push(n1 % 10+"");
			n1 /= 10;
			count ++;
			if(count % 3 == 0 && n1 > 0) {
				tmpStack.push(",");
			}
		}
		System.out.println("tmp : "+tmpStack.toString());
		
		int stacknum = tmpStack.size();
		
		for(int i=0;i<stacknum;i++) {
			n2+=tmpStack.peek();
			tmpStack.pop();
		}
		System.out.println("n2 : " + n2);
	}
}
