package input;

public class Quiz5 {
	public static void main(String[] args) {
		String s = "ABcefa";
		// 1. 문자열을 내림차순으로 정렬하라
		
		StringBuffer sb = new StringBuffer(s);
		
		System.out.println(sb); //afecBA
		System.out.println(sb.charAt(0));
		// 버블 정렬
		for(int i=0;i<sb.length();i++) {
			for(int j=0;j<sb.length()-1-i;j++) {
				if(sb.charAt(j)<sb.charAt(j+1)) {
					System.out.println(sb.toString());
					char temp = sb.charAt(j+1);
					sb.setCharAt(j+1, sb.charAt(j));
					sb.setCharAt(j,temp);
				}
			}
		}
		System.out.println("최종"+sb.toString());
	}
}
