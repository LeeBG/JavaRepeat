package loop;

public class Quiz1 {
	public static void main(String[] args) {
		String str = "";
		
		for(int i = 1;i<=25;i++) {
			if(i % 2 != 0) {
				str += "* ";
			}else {
				str += "  ";
			}
			if(i % 5 == 0) {
				str += "\n";
			}
		}
		System.out.println(str);
	}
}
